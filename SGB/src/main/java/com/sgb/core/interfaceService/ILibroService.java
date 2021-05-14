package com.sgb.core.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.sgb.core.modelo.Libro;

@Repository
public interface ILibroService {
	public List<Libro>tablaL();
	public Optional<Libro>listarID(int id);
	public int saveL(Libro l);
	public void delete(int id);
}
