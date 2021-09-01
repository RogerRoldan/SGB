package com.sgb.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sgb.core.modelo.Multa;
import com.sgb.core.modelo.Persona;
import com.sgb.core.interfaceService.IFineService;
import com.sgb.core.interfaceService.IPersonService;


@Controller
@RequestMapping
@Secured({"ROLE_ADMIN","ROLE_USER"})
public class ControllerFine {
	
	@Autowired
	private IFineService service;
	@Autowired
	private IPersonService serviceperson;
	
	@GetMapping("/crudMU")
	public String tablaMU(Model model,org.springframework.security.core.Authentication auth) {
	String username = auth.getName();
	Persona p = serviceperson.listarname(username);
	List<Multa>multa=service.listarIdP(p.getId());
	model.addAttribute("multa",multa);
		return "crudMU";
	}


}
