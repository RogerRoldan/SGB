package com.sgb.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgb.core.modelo.Libro;
@Repository
public interface ILibro extends CrudRepository<Libro, Integer> {

}
