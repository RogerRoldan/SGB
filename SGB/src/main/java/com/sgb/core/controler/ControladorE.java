package com.sgb.core.controler;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgb.core.interfaceService.IEjemplarService;
import com.sgb.core.modelo.Ejemplar;
import com.sgb.core.modelo.Libro;
import com.sgb.core.interfaceService.ILibroService;


@Controller
@RequestMapping

public class ControladorE {
	
	@Autowired
	private IEjemplarService service;
	@Autowired
	private ILibroService service1;

	@GetMapping({"/crudE/{idL}","/tablaE/{idL}"})
	public String tablaE(@PathVariable int idL, Model model) {
		Optional<Libro>libro=service1.listarID(idL);
		model.addAttribute("libro", libro);
		List<Ejemplar>ejemplar=service.listarIdL(idL);
		model.addAttribute("ejemplar",ejemplar);
		return "crudE";
	}
	@GetMapping("/newE/{idL}")
	public String agregarE(@PathVariable int idL,Model model) {
		Ejemplar e = new Ejemplar();
		e.setIdL(idL);
		e.setEstado("Disponible");
		service.saveE(e);
		model.addAttribute("ejemplar",e);
		return "redirect:/crudE/{idL}"; }


	@GetMapping("/editarE/{idE}/{idL}/{estado}")
	public String EditarE(@PathVariable int idE, @PathVariable int idL, @PathVariable String estado, Model model) {
		
		Ejemplar e = service.listarIdE(idE);
		e.setIdE(idE);
		e.setIdL(idL);
		e.setEstado(estado);
		service.saveE(e);
		model.addAttribute("ejemplar",e);
		return "redirect:/crudE/{idL}"; }
	}
