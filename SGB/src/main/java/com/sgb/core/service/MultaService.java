package com.sgb.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgb.core.interfaceService.IMultaService;
import com.sgb.core.interfaces.IMulta;
import com.sgb.core.modelo.Multa;
@Service
public class MultaService implements IMultaService {

	@Autowired
	private IMulta data;
	
	@Override
	public List<Multa> tablaM() {
		return (List<Multa>)data.findAll();
	}

	
	@Override
	public int saveM(Multa m) {
		int res=0;
		Multa multa=data.save(m);
		if (!multa.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

	
	@Override
	public List<Multa>listarIdP(int idP){
		return data.findByIdP(idP);
	}


}
