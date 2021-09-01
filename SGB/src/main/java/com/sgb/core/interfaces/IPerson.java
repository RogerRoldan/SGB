package com.sgb.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgb.core.modelo.Persona;
@Repository
public interface IPerson extends CrudRepository<Persona, Integer> {
	Persona findByname(String username);
}
