package com.sgb.core.interfaceService;

import java.util.List;

import com.sgb.core.modelo.Pago;

public interface IPaymentService {
	
	public List<Pago>tablapagos();
	public int savePago(Pago p);
	public void deletepago(int id);

}
