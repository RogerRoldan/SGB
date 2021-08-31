package com.sgb.core.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sgb.core.modelo.Persona;

public interface IpersonaService {
	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona p);
	public void delete(int id);
	public Persona listarname(String username);

	

}
