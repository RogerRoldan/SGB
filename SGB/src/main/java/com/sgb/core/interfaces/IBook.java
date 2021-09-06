package com.sgb.core.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgb.core.modelo.Libro;
@Repository
public interface IBook extends CrudRepository<Libro, Integer> {

	Optional<Libro> findByIdL(int idL);

	

}
