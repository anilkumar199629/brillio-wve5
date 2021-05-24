package com.brillio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Book;
import com.brillio.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public  Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public List<Book> getBook() {
		return repository.findAll();
	}
	
	public  Book getBookById( int bookId) {
		Optional<Book> book= repository.findById(bookId);
		if(book.isPresent()) {
			return book.get();
		}
		else {
			return null;
		}
	}
}
