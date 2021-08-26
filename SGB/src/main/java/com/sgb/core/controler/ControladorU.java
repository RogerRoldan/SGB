package com.sgb.core.controler;

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

import com.sgb.core.interfaceService.IpersonaService;
import com.sgb.core.modelo.Persona;

@Controller
@Secured("ROLE_ADMIN")
@RequestMapping

public class ControladorU {
	
	@Autowired
	private IpersonaService service;
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	
	@GetMapping({"/listar","/crudU"})
	public String listar(Model model) {
		List<Persona>personas=service.listar();
		model.addAttribute("personas", personas);
		return "crudU";
	}
	

	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona",new Persona());
		return "formU";
	}
	

	@PostMapping("/save")
	public String save(@Validated Persona p, Model model) {
		p.setClave(passEncoder.encode(p.getClave()));
		if(p.getRol()==null) {
			p.setRol("ROLE_USER");
		}
		service.save(p);
		return "redirect:/listar";
	}
	

	@GetMapping ("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Persona>persona=service.listarId(id);
		model.addAttribute("persona", persona);
		return "formU";
	}
	
	
	@GetMapping ("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}