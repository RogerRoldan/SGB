package com.sgb.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sgb.core.modelo.Persona;
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
