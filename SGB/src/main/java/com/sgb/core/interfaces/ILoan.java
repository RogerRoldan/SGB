package com.sgb.core.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sgb.core.modelo.Prestamo;

@Repository
public interface ILoan extends CrudRepository<Prestamo, Integer>{

	Prestamo findByIdPrestamo( int idPrestamo);
	List<Prestamo> findByIdUsuarioAndEstado(int idPrestamo, String entregado);

}
