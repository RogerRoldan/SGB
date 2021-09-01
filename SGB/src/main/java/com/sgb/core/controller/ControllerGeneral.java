package com.sgb.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.modelo.Persona;

@Controller
@RequestMapping
public class ControllerGeneral {
	
	@Autowired
	private IPersonService service;
	
	
	@GetMapping({"/","index"})
	public String rediccionmenu(org.springframework.security.core.Authentication auth) {
		
		String username = auth.getName();
		Persona p = service.listarname(username);
		String role = p.getRol();
		
		switch(role) {
		case ("ROLE_ADMIN"):
			return "menuadmin";
		
			
		case ("ROLE_USER"):
			return "menuusu";
			
		default: return "";
		}
			}

	
	@GetMapping("/menuadministrador")
	public String menuadmin(){
		return "menuadmin";
	}
	
	@GetMapping("/menuusuario")
	public String menuusu(){
		return "menuusu";
	}
	}
	