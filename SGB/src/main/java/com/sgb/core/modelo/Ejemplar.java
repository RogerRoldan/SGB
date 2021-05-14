package com.sgb.core.modelo;
/**
 * Esta clase  corresponde a la informacion de cada Ejemplar
 * @author Roger, Marlon, Yesica
 *
 */
public class Ejemplar {
		/**Identificador del ejemplar*/
		private int idE;
		/**Estado del ejemplar*/
		private String estado;
		
		/**Constructor General del ejemplar */
		public Ejemplar() {
			// TODO Auto-generated constructor stub
		}
		/**Constructor 
		 * @param idE del ejemplar
		 * @param estado del libro
		 */
		public Ejemplar(int idE, String estado) {
			super();
			this.idE = idE;
			this.estado = estado;
		}
		
		/**Metodo para obtener el id del Ejemplar
		 * @return  id del Ejemplar */
		public int getIdE() {
			return idE;
		}
		/**Metodo para modificar el id del Ejemplar
		 * @param  idE del Ejemplar */
		public void setIdE(int idE) {
			this.idE = idE;
		}
		/**Metodo para obtener el estado del Ejemplar
		 * @return  estado del Ejemplar */
		public String getEstado() {
			return estado;
		}
		/**Metodo para modificar el estado del Ejemplar
		 * @param  estado del Ejemplar */
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
		
		
}
