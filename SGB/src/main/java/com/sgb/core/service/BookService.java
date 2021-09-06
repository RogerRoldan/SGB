package com.sgb.core.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgb.core.interfaceService.IBookService;
import com.sgb.core.interfaces.IBook;
import com.sgb.core.modelo.Libro;
@Service
public class BookService implements IBookService{
	
	@Autowired
	private IBook data;
	@Override
	public List<Libro> tablaL() {
		return (List<Libro>)data.findAll();
	}

	
	@Override
	public Optional<Libro>listarIdL(int idL) {
		return data.findByIdL(idL);
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
