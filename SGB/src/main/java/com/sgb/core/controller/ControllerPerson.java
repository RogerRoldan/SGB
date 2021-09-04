package com.sgb.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.modelo.Persona;

@Controller
@Secured("ROLE_ADMIN")
@RequestMapping

public class ControllerPerson {
	
	@Autowired
	private IPersonService service;
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	
	@GetMapping({"/listar","/crudU"})
	public String listar(Model model) {
		List<Persona>personas=service.listar();
		model.addAttribute("personas", personas);
		return "CrudPerson";
	}
	

	@GetMapping("/newP")
	public String agregar(Model model) {
		model.addAttribute("persona",new Persona());
		return "FormPerson";
	}
	

	@PostMapping("/saveP")
	public String save(@Validated Persona p, Model model) {
		int longitud = p.getClave().length();
		if (longitud!=60) {
			p.setClave(passEncoder.encode(p.getClave()));
		}
		
		if(p.getRol()==null) {
			p.setRol("ROLE_USER");
		}
		service.save(p);
		return "redirect:/crudU";
	}
	

	@GetMapping ("/editarP/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Persona>persona=service.listarId(id);
		model.addAttribute("persona", persona);
		return "FormPerson";
	}
	
	
	@GetMapping ("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/crudU";
	}
}