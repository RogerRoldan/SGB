package com.sgb.core.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
	public class ControllerLogin {
		
		@GetMapping("/login")
		public String login(@RequestParam(value="error", required=false) String error,
				@RequestParam(value="logout", required=false) String logout,
				Model model, Principal principal, RedirectAttributes attribute){
				if(error!=null) {
					model.addAttribute("error","Error de Acceso: Usuario y/o Contraseña son incorrectos");
				}
				if(principal!=null) {
					attribute.addFlashAttribute("warning","Sesion ya iniciada");
					return "redirect:/";
				}
				if(logout!=null) {
					attribute.addAttribute("sucess","Sesion cerrada");
					
				}
				
				return "login";
		}
}