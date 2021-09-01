package com.sgb.core.interfaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sgb.core.modelo.Ejemplar;

@Repository
public interface IExemplar extends CrudRepository<Ejemplar, Integer>  {

	List<Ejemplar> findByIdL(int idL);
	Ejemplar findByIdE(int idE);

}
