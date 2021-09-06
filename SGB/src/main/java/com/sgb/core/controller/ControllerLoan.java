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
import com.sgb.core.interfaceService.IExemplarService;
import com.sgb.core.interfaceService.ILoanService;
import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.modelo.Ejemplar;
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
	@Autowired 
	private IExemplarService serviceexemplar;
	@Autowired
	private ILoanService serviceloan;
	
	
	
	@GetMapping("/devolver/{idp}")
	public String devolver(Model model, @PathVariable int idp) {
	
		Prestamo prestamo = serviceloan.listaridprestamo(idp);
		prestamo.setEstado("Entregado");
		int idpersona= prestamo.getIdUsuario();
		
		Ejemplar ejemplar = serviceexemplar.listarIdE(prestamo.getIdEjemplar());
		ejemplar.setEstado("Disponible");
		
		serviceloan.saveP(prestamo);
		serviceexemplar.saveE(ejemplar);
		
		return "redirect:/CrudLoanAUE/"+idpersona;
	}
	
	
	
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

	
	@GetMapping("/newPrestamo/{idpersona}/{idlibro}")
	public String agregarprestamoidlibro(@PathVariable int idpersona,@PathVariable int idlibro, Model model)
	{
		List<Ejemplar>ejemplar= serviceexemplar.listaridLAndEstado(idlibro,"Disponible");
		Prestamo prestamo = new Prestamo();
		List<Libro>libro = servicebook.tablaL();
		
		
		prestamo.setIdUsuario(idpersona);
		
		model.addAttribute("prestamo",prestamo);
		model.addAttribute("libro",libro);
		model.addAttribute("ejemplar",ejemplar);
		
		return "FormLoan";
	}
	
	@GetMapping({"/newPrestamo/{idpersona}"})
	public String agregarPrestamo(@PathVariable int idpersona, Model model) {
		
		Prestamo prestamo = new Prestamo();
		List<Libro>libro = servicebook.tablaL();
		prestamo.setIdUsuario(idpersona);
		model.addAttribute("prestamo",prestamo);
		model.addAttribute("libro",libro);
		model.addAttribute("ejemplar",new Ejemplar());
		return "FormLoan"; 
		}
	
	@PostMapping("/savePrestamo/{idl}")
	public String saveL(@Validated Prestamo p,@PathVariable int idl,Model model) {
		p.setIdLibro(idl);
		p.setEstado("Activo");
		
		Ejemplar ejemplar = serviceexemplar.listarIdE(p.getIdEjemplar());
		ejemplar.setEstado("Prestado");
		
		serviceexemplar.saveE(ejemplar);
		service.saveP(p);
		int id=p.getIdUsuario();
		return "redirect:/CrudLoanAUA/"+id;
	}
}
