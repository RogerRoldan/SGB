package com.sgb.core.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Esta clase  corresponde a la informacion de cada Persona
 * @author Roger, Marlon, Yesica
 *
 */

@Entity
@Table(name="persona")



public class Persona {
	/**Identificador de la persona*/
	@Id
	@GeneratedValue
	
	private int id;
	/**Nombre Persona */
	private String name;
	/**Telefono de la persona */
	private String telefono;
	/**Correo de la persona */
	private String correo;
	/**Telefono de la persona */
	private String clave;
	
	/**Constructor General Persona */
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	/**Constructor 
	 * @param id de la persona
	 * @param name de la persona
	 * @param telefono de la persona
	 * @param correo de la persona
	 * @param clave de la persona
	 */
	public Persona(int id, String name, String telefono, String correo, String clave) {
		super();
		this.id = id;
		this.name = name;
		this.telefono = telefono;
		this.correo = correo;
		this.clave = clave;
	}
	
	/**Metodo para obtener el id de la persona
	 * @return  id de la persona */
	public int getId() {
		return id;
	}
	/**Metodo para modificar el id de la persona
	 * @param  id de la persona */
	public void setId(int id) {
		this.id = id;
	}
	/**Metodo para obtener el nombre de la persona
	 * @return  nombre de la persona */
	public String getName() {
		return name;
	}
	/**Metodo para modificar el nombre de la persona
	 * @param  name  persona */
	public void setName(String name) {
		this.name = name;
	}
	/**Metodo para obtener el telefono de la persona
	 * @return telefono de la persona */
	public String getTelefono() {
		return telefono;
	}
	/**Metodo para modificar el telefono de la persona
	 * @param  telefono de la persona */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**Metodo para obtener el correo de la persona
	 * @return  correo de la persona */
	public String getCorreo() {
		return correo;
	}
	/**Metodo para modificar el correo de la persona
	 * @param  correo de la persona */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**Metodo para obtener la clave de la persona
	 * @return  clave de la persona */
	public String getClave() {
		return clave;
	}
	/**Metodo para modificar la clave de la persona
	 * @param  clave de la persona */
	public void setClave(String clave) {
		this.clave = clave;
	}

	

}
