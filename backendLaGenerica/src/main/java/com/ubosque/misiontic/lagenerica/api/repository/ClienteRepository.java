package com.ubosque.misiontic.lagenerica.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ubosque.misiontic.lagenerica.api.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Integer> {

}
