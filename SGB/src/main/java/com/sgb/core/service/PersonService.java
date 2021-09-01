package com.sgb.core.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgb.core.interfaceService.IPersonService;
import com.sgb.core.interfaces.IPerson;
import com.sgb.core.modelo.Persona;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private IPerson data;
	@Override
	public List<Persona> listar() {
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona=data.save(p);
			if(!persona.equals(null)) {
				res=1;
			}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Persona listarname(String username) {
		return data.findByname(username);
	}
	



}
