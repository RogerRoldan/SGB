package com.sgb.core.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sgb.core.interfaceService.IFineService;
import com.sgb.core.interfaceService.IPaymentService;
import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.modelo.Multa;
import com.sgb.core.modelo.Pago;
import com.sgb.core.modelo.Persona;

@Controller
public class ControllerPayment {

	@Autowired
	private IPaymentService service;
	@Autowired 
	IFineService servicemultas;
	@Autowired
	IPersonService servicepersona;
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/CrudPagos")
	public String tablaPagos(Model model) {
		
		List<Pago>pagos= service.tablapagos();
		model.addAttribute("pagos",pagos);
		
		return "CrudPayment";
	}
	@Secured({"ROLE_ADMIN"})
	@GetMapping("newPago/{idm}/{valor}")
	public String newpago(Model model, @PathVariable int idm, @PathVariable double valor, org.springframework.security.core.Authentication auth) {
		Pago pagos= new Pago();
		pagos.setIdMulta(idm);
		pagos.setValorpago(valor);
		pagos.setFecha(LocalDate.now());	
		
		String nombre=auth.getName();
		Persona  p=servicepersona.listarname(nombre);
		pagos.setIdPersona(p.getId());
		
		Multa multa = servicemultas.listaridM(idm);
		multa.setEstadomulta("Cancelada");
		servicemultas.saveM(multa);
		
		service.savePago(pagos);
		model.addAttribute("pagos",pagos);
		
		return "redirect:/CrudPagos";
	}
	
}
