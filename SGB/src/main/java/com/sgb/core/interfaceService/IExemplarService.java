package com.sgb.core.interfaceService;

import java.util.List;
import com.sgb.core.modelo.Ejemplar;

public interface IExemplarService {
	public List<Ejemplar>tablaE();
	public Ejemplar listarIdE(int idE);
	public List<Ejemplar> listarIdL(int idL);
	public List<Ejemplar> listaridLAndEstado(int idL,String estado);
	public int saveE(Ejemplar e);
	public void delete(int id);
	
}
