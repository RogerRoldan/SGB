package com.sgb.core.modelo;
/**
 * Esta clase  corresponde a la informacion de las multas
 * @author Roger, Marlon, Yesica
 *
 */
public class Multa {
	/**Identificador de la multa*/
	private int idM;
	/**Identificador del usuario*/
	private int idU;
	/**Descripcion de la multa*/
	private String descripcion;
	/**Identificador del libro*/
	private int idL;
	/**Valor de la multa*/
	private double valor;
	
	/**Constructor General de la multa */
	public Multa() {
		// TODO Auto-generated constructor stub
	}

	/**Constructor 
	 * @param idM de la Multa
	 * @param idU del usuario
	 * @param descripcion de la multa
	 * @param idL del libro
	 */
	public Multa(int idM, int idU, String descripcion, int idL) {
		super();
		this.idM = idM;
		this.idU = idU;
		this.descripcion = descripcion;
		this.idL = idL;
	}

	/**Metodo para obtener el id de la Multa
	 * @return  id de la multa */
	public int getIdM() {
		return idM;
	}

	/**Metodo para modificar el id de la Multa
	 * @param  idM de la multa */
	public void setIdM(int idM) {
		this.idM = idM;
	}

	/**Metodo para obtener el id del usuario
	 * @return  id del usuario */
	public int getIdU() {
		return idU;
	}

	/**Metodo para modificar el id del usuario
	 * @param  idU del usuario */
	public void setIdU(int idU) {
		this.idU = idU;
	}

	/**Metodo para obtener la descripcion de la multa
	 * @return  descripcion de la multa*/
	public String getDescripcion() {
		return descripcion;
	}

	/**Metodo para modificar la descripcion de la multa
	 * @param  descripcion de la multa*/
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**Metodo para modificar el id del libro
	 * @return  idL del libro */
	public int getIdL() {
		return idL;
	}

	/**Metodo para modificar el id del libro
	 * @param  idL del libro */
	public void setIdL(int idL) {
		this.idL = idL;
	}
	
	
}


