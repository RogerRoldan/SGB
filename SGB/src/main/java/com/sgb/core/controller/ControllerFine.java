package com.sgb.core.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.sgb.core.modelo.Multa;
import com.sgb.core.modelo.Persona;
import com.sgb.core.interfaceService.IFineService;
import com.sgb.core.interfaceService.IPersonService;



@Controller
@RequestMapping
public class ControllerFine {
	
	
	@Autowired
	private IFineService service;
	@Autowired
	private IPersonService serviceperson;
	
	
	@GetMapping("/crudMU")
	public String tablaMU(Model model,org.springframework.security.core.Authentication auth) {
		
		String username = auth.getName();
		Persona p = serviceperson.listarname(username);	
		int idp= p.getId();
		String estado="Pendiente";
		List<Multa>multa=service.listarIdPAndEstado(idp, estado);
		
		model.addAttribute("multa",multa);
		model.addAttribute("persona",p);
		return "CrudFineUser";
	}
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/crudMAUA/{idp}")
	public String tablaMAUA(Model model, @PathVariable int idp) {
		
		Optional<Persona> p= serviceperson.listarId(idp);
		String estado="Pendiente";
		List<Multa>multa=service.listarIdPAndEstado(idp, estado);
		model.addAttribute("multa",multa);
		model.addAttribute("persona",p);
		return "CrudFineUser";
	}
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/crudMAUC/{idp}")
	public String tablaMAUC(Model model, @PathVariable int idp) {
		Optional<Persona> p= serviceperson.listarId(idp);
		String estado="Cancelada";
		List<Multa>multa=service.listarIdPAndEstado(idp, estado);
		model.addAttribute("multa",multa);
		model.addAttribute("persona",p);
		return "CrudHistoric";
	}
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/CrudMultasAdministrador")
	public String tablaMA(Model model) {
	
		List<Persona>personas=serviceperson.listar();
		model.addAttribute("personas", personas);
		return "CrudFineAdministrator";
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/newMulta/{idP}")
	public String agregarMulta(@PathVariable int idP, Model model) {
		
		Multa multa = new Multa();
		multa.setIdP(idP);
		model.addAttribute("multa",multa);
		return "FormFine"; 
		}
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("/saveMulta")
	public String saveL(@Validated Multa m,Model model) {
		if(m.getFecha()==null && m.getEstadomulta()==null) {
			m.setFecha(LocalDate.now());
			m.setEstadomulta("Pendiente");
		}
		
		service.saveM(m);
		int idp=m.getIdP();
		return "redirect:/crudMAUA/"+idp;
	}
		

}
