package com.sgb.core.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgb.core.interfaceService.IPaymentService;
import com.sgb.core.interfaces.IPayment;
import com.sgb.core.modelo.Pago;

@Service
public class PagoService implements IPaymentService {
	
	@Autowired
	private IPayment data;

	@Override
	public List<Pago> tablapagos() {
		
		return (List<Pago>)data.findAll();
	}

	@Override
	public int savePago(Pago p) {
		int res=0;
		Pago pago=data.save(p);
		
		if(!pago.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deletepago(int id) {
		data.deleteById(id);
		
	}

}
