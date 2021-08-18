package com.sgb.core.interfaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sgb.core.modelo.Multa;

@Repository
public interface IMulta extends CrudRepository<Multa, Integer> {

	List<Multa> findByIdP(int idP);


}
