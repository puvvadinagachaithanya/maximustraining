package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {
	// list of books, null, empty, throw exception
	List<Book> getByAuthor(String author) throws BookNotFoundException;

	List<Book> getByLessPrice(double price);

//	/ book,exception, null
	Book getById(int bookId) throws BookNotFoundException;

	void addBook(Book book);
}
