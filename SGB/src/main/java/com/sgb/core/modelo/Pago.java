package com.sgb.core.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pago")

public class Pago {
	@Id
	@GeneratedValue
	private int id;
	private int idM;
	private int idP;
	private int fecha;
	private double valorpago;
	
	
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pago(int id, int idM, int idP, int fecha, double valorpago) {
		super();
		this.id = id;
		this.idM = idM;
		this.idP = idP;
		this.fecha = fecha;
		this.valorpago = valorpago;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdM() {
		return idM;
	}


	public void setIdM(int idM) {
		this.idM = idM;
	}


	public int getIdP() {
		return idP;
	}


	public void setIdP(int idP) {
		this.idP = idP;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	public double getValorpago() {
		return valorpago;
	}


	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}
	
	
	
	
	
	
	
	
}
