package com.sgb.core.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping

public class Controlador {

	@GetMapping({"/menuadmin","/"})
	public String index(){
		return "menuadmin";
	}
	@GetMapping({"/menuusu"})
	public String menuusu(){
		return "menuusu";
	}
	}
	