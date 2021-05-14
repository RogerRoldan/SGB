package com.sgb.core.controler;

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

import com.sgb.core.interfaceService.ILibroService;
import com.sgb.core.modelo.Libro;

@Controller
@RequestMapping
public class ControladorL {
	
	@Autowired
	private ILibroService service;
	@GetMapping({"/tablaL","/crudL"})
	public String tablaL(Model model) {
		List<Libro>libro=service.tablaL();
		model.addAttribute("libro", libro);
		return "crudL";
	}
	@GetMapping("/newL")
	public String agregarL(Model model) {
		model.addAttribute("libro",new Libro());
		return "formL";
	}
	@PostMapping("/saveL")
	public String saveL(@Validated Libro l,Model model) {
		service.saveL(l);
		return "redirect:/tablaL";
	}
	
	@GetMapping("/editarL/{idL}")
	public String editar(@PathVariable int idL, Model model) {
		Optional<Libro>libro=service.listarID(idL);
		model.addAttribute("libro", libro);
		return "formL";
	}
}
