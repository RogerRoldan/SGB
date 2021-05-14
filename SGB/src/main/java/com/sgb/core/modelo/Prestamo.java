package com.sgb.core.modelo;
import java.util.Date;
/**
 * Esta clase  corresponde a la informacion de cada Persona
 * @author Roger, Marlon, Yesica
 *
 */

	public class Prestamo {
		/**Identificador de la persona*/
		private int idP;
		/**Identificador de la usuario*/
		private int idU;
		/**Identificador del libro*/
		private int idL;
		/**Identificador del ejemplar*/
		private int idE;
		/**Fecha de inicio del prestamo*/
		private Date finicio;
		/**Fecha de fin del prestamo*/
		private Date ffinal;
		/** Verificación del libro entregado */
		private boolean entregado;
	
		/**Constructor General del prestamo */	
	public Prestamo() {
		// TODO Auto-generated constructor stub
	}
	/**Constructor 
	 * @param idP del prestamo
	 * @param idU del usuario
	 * @param idL del libro
	 * @param idE del ejemplar
	 * @param finicio del prestamo
	 * @param ffinal del prestamo
	 * @param entregado del libro
	 */	
	public Prestamo(int idP, int idU, int idL, int idE, Date finicio, Date ffinal, boolean entregado) {
			super();
			this.idP = idP;
			this.idU = idU;
			this.idL = idL;
			this.idE = idE;
			this.finicio = finicio;
			this.ffinal = ffinal;
			this.entregado = entregado;
		}
	/**Metodo para obtener el id del prestamo
	 * @return  id del prestamo */
	public int getIdP() {
		return idP;
	}
	/**Metodo para modificar el id del prestamo
	 * @param  idP del prestamo */
	public void setIdP(int idP) {
		this.idP = idP;
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
	/**Metodo para obtener el id del libro
	 * @return  id del libro */
	public int getIdL() {
		return idL;
	}
	/**Metodo para modificar el id del libro
	 * @param  idL del libro */
	public void setIdL(int idL) {
		this.idL = idL;
	}
	/**Metodo para obtener el id del ejemplar
	 * @return  id del ejemplar */
	public int getIdE() {
		return idE;
	}
	/**Metodo para modificar el id del ejemplar
	 * @param  idE del ejemplar */
	public void setIdE(int idE) {
		this.idE = idE;
	}
	/**Metodo para obtener la fecha inicial del prestamo
	 * @return  finicio fecha inicial del prestamo */
	public Date getFinicio() {
		return finicio;
	}
	/**Metodo para modificar la fecha inicial del prestamo
	 * @param  finicio fecha inicial del prestamo */
	public void setFinicio(Date finicio) {
		this.finicio = finicio;
	}
	/**Metodo para obtener la fecha final del prestamo
	 * @return  ffinal fecha final del prestamo */
	public Date getFfinal() {
		return ffinal;
	}
	/**Metodo para modificar la fecha final del prestamo
	 * @param  ffinal fecha final del prestamo */
	public void setFfinal(Date ffinal) {
		this.ffinal = ffinal;
	}
	/**Metodo para verificar si el libro fue entregado
	 * @return  entregado  verficación de la entrega del libro */
	public boolean isEntregado() {
		return entregado;
	}
	/**Metodo para modificar la variable, si el libro fue entregado
	 * @param  entregado  verficación de la entrega del libro */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	
	
	
	}
