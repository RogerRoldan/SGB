package com.sgb.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sgb.core.interfaceService.IBookService;
import com.sgb.core.interfaceService.ILoanService;
import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.modelo.Libro;
import com.sgb.core.modelo.Persona;
import com.sgb.core.modelo.Prestamo;

@Controller
@RequestMapping

public class ControllerLoan {
	
	@Autowired
	private ILoanService service;
	@Autowired
	private IPersonService serviceperson;
	@Autowired
	private IBookService servicebook;
	
	
	
	@GetMapping({"/CrudLoan"})
	public String tablaLoan(Model model,org.springframework.security.core.Authentication auth) {
		String username = auth.getName();
		Persona p = serviceperson.listarname(username);	
		int id= p.getId();
		String estado ="Activo" ;
		List<Prestamo>prestamo = service.listarIdUsuarioAndEstado(id, estado);
		model.addAttribute("prestamo", prestamo);
		model.addAttribute("persona",p);
		return "CrudLoanUser";
	}
	
	
	@GetMapping("/CrudLoanAdmin")
	public String tablaLoanA(Model model) {
		List<Persona>personas=serviceperson.listar();
		model.addAttribute("personas", personas);
		return "CrudLoanAdministrator";
	}
	
	@GetMapping("/CrudLoanAUA/{id}")
	public String tablaLoanAUA(Model model, @PathVariable int id) {
		Optional<Persona> p= serviceperson.listarId(id);
		String estado="Activo";
		List<Prestamo>prestamo = service.listarIdUsuarioAndEstado(id, estado);
		model.addAttribute("prestamo", prestamo);
		model.addAttribute("persona",p);
		
		return "CrudLoanUser";
		
	}
	
	@GetMapping("/CrudLoanAUE/{id}")
	public String tablaLoanAUE(Model model, @PathVariable int id) {
		Optional<Persona> p= serviceperson.listarId(id);
		String estado="Entregado";
		List<Prestamo>prestamo = service.listarIdUsuarioAndEstado(id, estado);
		model.addAttribute("prestamo", prestamo);
		model.addAttribute("persona",p);
		return "CrudLoanHistoric";
	}

	
	@GetMapping("/newPrestamo/{id}")
	public String agregarPrestamo(@PathVariable int id, Model model) {
		
		Prestamo prestamo = new Prestamo();
		List<Libro>libro = servicebook.tablaL();
		prestamo.setIdUsuario(id);
		model.addAttribute("prestamo",prestamo);
		model.addAttribute("libro",libro);
		return "FormLoan"; 
		}
	
	@PostMapping("/savePrestamo")
	public String saveL(@Validated Prestamo p,Model model) {
		
		p.setEstado("Activo");
		service.saveP(p);
		int id=p.getIdUsuario();
		return "redirect:/CrudLoanAUA/"+id;
	}
}
