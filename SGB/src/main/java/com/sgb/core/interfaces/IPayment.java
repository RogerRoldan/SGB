package com.sgb.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.sgb.core.modelo.Pago;

public interface IPayment extends CrudRepository<Pago, Integer > {

}
