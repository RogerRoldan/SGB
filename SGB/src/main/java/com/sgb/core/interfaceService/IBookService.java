package com.sgb.core.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sgb.core.modelo.Libro;

public interface IBookService {
	public List<Libro>tablaL();
	public Optional<Libro>listarID(int id);
	public int saveL(Libro l);
	public void delete(int id);
}
