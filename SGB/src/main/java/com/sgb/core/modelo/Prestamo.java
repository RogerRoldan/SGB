package com.sgb.core.modelo;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
/**
 * Esta clase  corresponde a la informacion de cada Persona
 * @author Roger, Marlon, Yesica
 *
 */
	@Entity
	@Table(name="prestamo")
	public class Prestamo {
		/*Identificador de la persona*/
		@Id
		@GeneratedValue
		private int idPrestamo;
		/*Identificador de la usuario*/
		private int idUsuario;
		/*Identificador del libro*/
		private int idLibro;
		/*Identificador del ejemplar*/
		private int idEjemplar;
		/*Fecha de inicio del prestamo*/
		@Temporal (TemporalType.DATE)
		@DateTimeFormat (iso = ISO.DATE)
		private Date finicio;
		/*Fecha de fin del prestamo*/
		@Temporal (TemporalType.DATE)
		@DateTimeFormat (iso = ISO.DATE)
		private Date ffinal;
		/** Verificación del libro entregado */
		private String estado;
	
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

	public Prestamo(int idPrestamo, int idUsuario, int idLibro, int idEjemplar, Date finicio, Date ffinal,
			String estado) {
		super();
		this.idPrestamo = idPrestamo;
		this.idUsuario = idUsuario;
		this.idLibro = idLibro;
		this.idEjemplar = idEjemplar;
		this.finicio = finicio;
		this.ffinal = ffinal;
		this.estado = estado;
	}


	public int getIdPrestamo() {
		return idPrestamo;
	}


	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}


	public int getIdEjemplar() {
		return idEjemplar;
	}


	public void setIdEjemplar(int idEjemplar) {
		this.idEjemplar = idEjemplar;
	}


	public Date getFinicio() {
		return finicio;
	}


	public void setFinicio(Date finicio) {
		this.finicio = finicio;
	}


	public Date getFfinal() {
		return ffinal;
	}


	public void setFfinal(Date ffinal) {
		this.ffinal = ffinal;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
		