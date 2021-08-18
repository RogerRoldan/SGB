package com.sgb.core.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgb.core.interfaceService.ILibroService;
import com.sgb.core.interfaces.ILibro;
import com.sgb.core.modelo.Libro;
@Service
public class LibroService implements ILibroService{
	
	@Autowired
	private ILibro data;
	@Override
	public List<Libro> tablaL() {
		return (List<Libro>)data.findAll();
	}

	@Override
	public Optional<Libro> listarID(int idL) {
		return data.findById(idL);
	}

	@Override
	public int saveL(Libro l) {
		int res=0;
		Libro libro=data.save(l);
		if(!libro.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
