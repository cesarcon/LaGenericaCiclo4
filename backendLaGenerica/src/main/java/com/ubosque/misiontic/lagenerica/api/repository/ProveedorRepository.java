package com.ubosque.misiontic.lagenerica.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ubosque.misiontic.lagenerica.api.model.Proveedor;

public interface ProveedorRepository extends MongoRepository <Proveedor, Integer> {

}
