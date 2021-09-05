package com.sgb.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sgb.core.interfaceService.IFineService;
import com.sgb.core.interfaceService.IPaymentService;
import com.sgb.core.modelo.Pago;

@Controller
public class ControllerPayment {

	@Autowired
	private IPaymentService service;
	@Autowired 
	IFineService servicemultas;
	
	
	
	@GetMapping("CrudPagos")
	public String tablaPagos(Model model) {
		
		List<Pago>pagos= service.tablapagos();
		model.addAttribute("pagos",pagos);
		
		return "CrudPagos";
	}
	
}
