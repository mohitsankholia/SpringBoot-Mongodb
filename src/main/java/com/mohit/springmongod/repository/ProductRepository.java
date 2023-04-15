package com.mohit.springmongod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mohit.springmongod.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
