package com.sgb.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgb.core.interfaceService.ILoanService;
import com.sgb.core.interfaces.ILoan;
import com.sgb.core.modelo.Prestamo;


@Service
public class LoanService implements ILoanService{
	
	@Autowired
	private ILoan data;

	@Override
	public List<Prestamo> tablaP() {
		
		return (List<Prestamo>)data.findAll();
	}

	
	@Override
	public List<Prestamo> listaridprestamo(int idprestamo) {
		
		return data.findByIdPrestamo(idprestamo);
	}

	
	@Override
	public List<Prestamo> listarIdUsuarioAndEstado(int idusuario, String estado) {
	
		return data.findByIdUsuarioAndEstado(idusuario, estado);
	}

	@Override
	public int saveP(Prestamo p) {
		int res = 0;
		Prestamo prestamo = data.save(p);
		if(!prestamo.equals(null)) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void deleteP(int id) {
		data.deleteById(id);
	}
	

}
