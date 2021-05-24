package com.brillio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brillio.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {


	//Book getBookById(int bookId);
}