package com.sgb.core.modelo;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Esta clase  corresponde a la informacion de las multas
 * @author Roger, Marlon, Yesica
 *
 */

@Entity
@Table(name="multa")


public class Multa {
	/**Identificador de la multa*/
	@Id
	@GeneratedValue
	private int idM;
	/**Identificador del usuario*/
	private int idP;
	/**Descripcion de la multa*/
	private String descripcion;
	/**Fecha de la multa*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fecha;
	/**Estado de la multa*/
	private String estadomulta;
	/**Valor de la multa*/
	private double valor;
	
	/**Relaciones**/

	
	
	
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
	public Multa(int idM, int idP, String descripcion, LocalDate fecha,String estadomulta, double valor, Persona persona) {
		super();
		this.idM = idM;
		this.idP = idP;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.estadomulta = estadomulta;
		this.valor = valor;
		
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
	public int getIdP() {
		return idP;
	}

	/**Metodo para modificar el id del usuario
	 * @param  idU del usuario */
	public void setIdP(int idP) {
		this.idP = idP;
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
	
	/**Metodo para obtener la fecha de la multa
	 * @return  fecha de la multa*/
	public LocalDate getFecha() {
		return fecha;
	}
	/**Metodo para modificar la fecha de la multa
	 * @param  fecha de la multa*/
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	

	public String getEstadomulta() {
		return estadomulta;
	}

	public void setEstadomulta(String estadomulta) {
		this.estadomulta = estadomulta;
	}

	/**Metodo para obtener el valor de la multa
	 * @return  valor de la multa*/
	public double getValor() {
		return valor;
	}
	
	/**Metodo para modificar el valor de la multa
	 * @param  valor de la multa*/
	public void setValor(double valor) {
		this.valor = valor;
	}


	
}
