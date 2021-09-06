package com.sgb.core.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pago")

public class Pago {
	@Id
	@GeneratedValue
	private int idPago;
	private int idMulta;
	private int idPersona;
	private LocalDate fecha;
	private double valorpago;
	
	
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pago(int idPago, int idMulta, int idPersona, LocalDate fecha, double valorpago) {
		super();
		this.idPago = idPago;
		this.idMulta = idMulta;
		this.idPersona = idPersona;
		this.fecha = fecha;
		this.valorpago = valorpago;
	}


	public int getIdPago() {
		return idPago;
	}


	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}


	public int getIdMulta() {
		return idMulta;
	}


	public void setIdMulta(int idMulta) {
		this.idMulta = idMulta;
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public double getValorpago() {
		return valorpago;
	}


	public void setValorpago(double valorpago) {
		this.valorpago = valorpago;
	}


	
	
	
	
}
