package com.sgb.core.interfaceService;
import java.util.List;
import com.sgb.core.modelo.Prestamo;

public interface ILoanService {
	
	public List<Prestamo>tablaP();
	public Prestamo listaridprestamo(int idprestamo);
	public List<Prestamo> listarIdUsuarioAndEstado(int idusuario, String estado);
	public int saveP(Prestamo p);
	public void deleteP(int id);
	
}
