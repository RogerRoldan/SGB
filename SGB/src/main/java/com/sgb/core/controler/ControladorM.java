package com.sgb.core.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sgb.core.interfaceService.IMultaService;
import com.sgb.core.modelo.Multa;
import com.sgb.core.interfaceService.IpersonaService;

@Controller
@RequestMapping
@Secured({"ROLE_ADMIN","ROLE_USER"})
public class ControladorM {
	
	@Autowired
	private IMultaService service;
	@Autowired
	private IpersonaService servicep;
	
	@GetMapping("/crudMU")
	public String tablaMU(Model model,org.springframework.security.core.Authentication auth) {
	String username = auth.getName();
	int idp = servicep.listarname(username);
	List<Multa>multa=service.listarIdP(idp);
	model.addAttribute("multa",multa);
		return "crudMU";
	}


}
