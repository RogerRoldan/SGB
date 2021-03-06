package com.sgb.core.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Esta clase  corresponde a la informacion de cada Ejemplar
 * @author Roger, Marlon, Yesica
 *
 */

@Entity
@Table(name="ejemplar")
public class Ejemplar {
	/**Identificador del Libro*/
		private int idL;
		/**Identificador del ejemplar*/
		@Id
		@GeneratedValue
		private int idE;
		/**Estado del ejemplar*/
		private String estado;
		
		/**Constructor General del ejemplar */
		public Ejemplar() {
			// TODO Auto-generated constructor stub
		}
		/**Constructor 
		 * @param idL del libro
		 * @param idE del ejemplar
		 * @param estado del libro
		 */
		public Ejemplar(int idL, int idE, String estado) {
			super();
			this.idL = idL;
			this.idE = idE;
			this.estado = estado;
		}
		
		/**Metodo para obtener el id del Libro
		 * @return  id del libro */
		public int getIdL() {
			return idL;
		}
		/**Metodo para modificar el id del libro
		 * @param  idL del libro */
		public void setIdL(int idL) {
			this.idL = idL;
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
