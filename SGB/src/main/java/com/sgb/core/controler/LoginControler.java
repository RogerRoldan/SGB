package com.sgb.core.controler;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
	public class LoginControler {
		
		@GetMapping("/login")
		public String login(@RequestParam(value="error", required=false) String error,
				@RequestParam(value="logout", required=false) String logout,
				Model model,  Principal principal, RedirectAttributes attribute){
				if(error!=null) {
					model.addAttribute("error","Error de Acceso: Usuaio y/o Contraseña son incorrectos");
				}
				if(principal!=null) {
					attribute.addFlashAttribute("warning","Sesion ya iniciada");
					return "redirect:/listar";
				}
				if(logout!=null) {
					attribute.addAttribute("sucess","Sesion cerrada");
					return "redirect:/listar";
				}
				
				return "login";
		}
}