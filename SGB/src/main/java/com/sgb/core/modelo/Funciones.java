package com.sgb.core.modelo;
import java.util.Date;
/**
 * Esta clase  corresponde a las funciones del software.
 * @author Roger, Marlon, Yesica
 *
 */

public class Funciones {
	
	/**metodo agregar libro
	 * @param idL id del libro que se va a agregar
	 * @param nombreL nombre del libro que se va a agregar 
	 * @param genero genero del libro que se va a agregar
	 * @param autor autor del libro que se va a agregar
	 * @param editorial editorial del libro que se va a agregar
	 * */
	public void agregarL(int idL,String nombreL,String genero,String autor, String editorial ) {
		
	}
	/**metodo editar libro
	 * @param idL id del libro que se va 
	 * @param nombreL nombre del libro que se va a editar
	 * @param genero genero del libro que se va a editar
	 * @param autor autor del libro que se va a editar
	 * @param editorial editorial del libro que se va a editar
	 * */
	public void editarL(int idL,String nombreL,String genero,String autor, String editorial) {
		
	}
	/**metodo agregar ejemplar
	 * @param idE id del ejemplar que se va a agregar
	 * @param estado estado del  que se va a agregar
	 * @param idL id del libro al que pertenece el ejemplar. 
	 */
	public void agregarE(int idE,String estado,String idL) {
		
	}
	/**metodo editar ejemplar
	 * @param idE id del ejemplar que se va a editar
	 * @param estado estado del  que se va a editar
	 */
	public void editarE(int idE,String estado) {
		
	}
	/**metodo descalificar ejemplar
	 * @param idE id del ejemplar que se va a descalificar
	 */
	public void descalificarE(int idE) {
		
	}
	/**metodo prestamo ejemplar
	 * @param idP id del prestamo a realizar
	 * @param idE id del ejemplar que se va a prestar
	 * @param idU id del usuario al que se va a prestar el ejemplar
	 */
	public void prestamoE(int idP,int idE, int idU) {
		
	}
	/**metodo devolucion ejemplar
	 * @param idP id del prestamo
	 */
	public void devolucionE(int idP) {
		
	}
	/**metodo pago de multa
	 * @param idM id de la multa a pagar
	 */
	public void pagoMulta(int idM) {
		
	}
	/**metodo consulta de multa
	 * @param idU id del usuario al cual se le consultan las multas
	 */
	public void consultarMultas(int idU) {
		
	}
	/**metodo agregar usuario
	 * @param idU id del usuario que se va a agregar
	 * @param nombreU nombre del usuario que se va a agregar 
	 * @param correo correo del usuario que se va a agregar
	 * @param telefono telefono del usuario que se va a agregar
	 * @param contrasena contraseña del usuario que se va a agregar
	  */
	public void agregarPersona(int idU,String nombreU,String correo,String telefono, String contrasena ) {
		
	}
	/**metodo editar usuario
	 * @param idU id del usuario que se va a editar
	 * @param nombreU nombre del usuario que se va a editar
	 * @param correo correo del usuario que se va a editar
	 * @param telefono telefono del usuario que se va a editar
	 * @param contrasena contraseña del usuario que se va a editar
	  */
	public void editarPersona(int idU,String nombreU,String correo,String telefono, String contrasena) {
		
	}
	/**metodo descalificar usuario
	 * @param idU id del usuario que se va a descalificar*/
	public void descalificarUsuario(int idU) {
		
	}
	/**metodo generar multa
	 * @param idM id de la multa
	 * @param idU id del usuario que se va a multar
	 * @param idE id del ejemplar con el que se realizo la infraccion
	 * @param descripcion descripcion de la infraccion cometida
	 * @param valor valor de la multa generada.
	  */
	public void generarmulta(int idM, int idU, int idE,String descripcion,double valor) {
		
	}
	/**metodo consultar libros
	 * @param idL id del libro
	 * @param nombreL nombre del libro a consutar.
	 * @return idL id del libro consultado
	  */
	public int consultarlibros(int idL,String nombreL) {
		return idL;
	}
	/**metodo ampliar fecha del prestamo
	 * @param idP id del prestamo
	 * @param ffinal nueva fecha final del prestamo 
	  */
	public void ampliarfechas(int idP,Date ffinal) {
		
	}
	/**metodo estadoE del ejemplar
	 * @param idE id del ejemplar
	 * @param estado nuevo estado del ejemplar
	 * @return estado nuevo estado del ejemplar
	 * */
	public String estadoE(int idE, String estado) {
		
		return estado;
	}
	

	
	
	
	
}
