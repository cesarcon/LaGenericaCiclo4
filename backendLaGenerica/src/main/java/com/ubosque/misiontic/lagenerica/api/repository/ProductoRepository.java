package com.ubosque.misiontic.lagenerica.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ubosque.misiontic.lagenerica.api.model.Producto;

public interface ProductoRepository extends MongoRepository<Producto, Integer>{

}
