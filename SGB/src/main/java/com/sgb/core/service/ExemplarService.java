package com.sgb.core.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgb.core.interfaceService.IExemplarService;
import com.sgb.core.interfaces.IExemplar;
import com.sgb.core.modelo.Ejemplar;


@Service
public class ExemplarService implements IExemplarService{
	
	@Autowired
	private IExemplar data;
	
	@Override
	public List<Ejemplar> tablaE() {
		return (List<Ejemplar>)data.findAll();
	}

	@Override
	public Ejemplar listarIdE(int idE) {
		return data.findByIdE(idE);
	}

	@Override
	public int saveE(Ejemplar e) {
		int res=0;
		Ejemplar ejemplar=data.save(e);
		if(!ejemplar.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idE) {
		data.deleteById(idE);
	}

	@Override
	public List<Ejemplar> listarIdL(int idL) {
		return data.findByIdL(idL);
	}
}

	

