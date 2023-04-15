package com.mohit.springmongod.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.springmongod.entity.Book;
import com.mohit.springmongod.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookrepository;

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		bookrepository.save(book);
		return "Added book with id : " + book.getId();
	}

	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return bookrepository.findAll();
	}

	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
		return bookrepository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		bookrepository.deleteById(id);
		return "book deleted with id : " + id;
	}
}
