package com.mohit.springmongod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mohit.springmongod.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
