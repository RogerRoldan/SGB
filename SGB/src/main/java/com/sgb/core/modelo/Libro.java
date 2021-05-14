package com.sgb.core.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Esta clase  corresponde a la informacion de cada Libro
 * @author Roger, Marlon, Yesica
 *
 */
@Entity
@Table(name="libro")
public class Libro {
	/**Identificador del libro*/
	@Id
	@GeneratedValue
	private int idL;
	/**Nombre del libro*/
	private String nombreL;
	/**genero del libro*/
	private String generoL;
	/**autor del libro*/
	private String autor;
	/**editorial del libro*/
	private String editorial;
	
	/**Constructor General del libro */
	public Libro(){
		
	}
	/**Constructor 
	 * @param idL del libro
	 * @param nombreL del libro
	 * @param generoL del libro
	 * @param autor del libro
	 * @param editorial del libro
	 */
	
	public Libro(int idL, String nombreL, String generoL, String autor, String editorial) {
		super();
		this.idL = idL;
		this.nombreL = nombreL;
		this.generoL = generoL;
		this.autor = autor;
		this.editorial = editorial;
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
	/**Metodo para obtener el nombre del libro
	 * @return  nombre del libro */
	public String getNombreL() {
		return nombreL;
	}
	/**Metodo para modificar el nombre del libro
	 * @param  nombreL del libro */
	public void setNombreL(String nombreL) {
		this.nombreL = nombreL;
	}
	/**Metodo para obtener el genero del libro
	 * @return  genero del libro */
	public String getGeneroL() {
		return generoL;
	}
	/**Metodo para modificar el genero del libro
	 * @param  generoL del libro */
	public void setGeneroL(String generoL) {
		this.generoL = generoL;
	}
	/**Metodo para obtener el autor del libro
	 * @return autor del libro */
	public String getAutor() {
		return autor;
	}
	/**Metodo para modificar el autor del libro
	 * @param  autor del libro */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**Metodo para obtener la editorial del libro
	 * @return  editorial del libro */
	public String getEditorial() {
		return editorial;
	}
	/**Metodo para modificar la editorial del libro
	 * @param  editorial del libro */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	

}
