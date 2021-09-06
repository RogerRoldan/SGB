package com.sgb.core.interfaceService;

import java.util.List;
import com.sgb.core.modelo.Multa;

public interface IFineService {
	public List<Multa>tablaM();
	public int saveM(Multa m);
	public void delete(int id);
	public List<Multa> listarIdP(int idP);
	public List<Multa> listarIdPAndEstado(int idP, String estadomulta);
	public Multa listaridM(int idM);
	
	

}
