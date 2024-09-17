package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public class OrderDetails {

	IBookService bookService;

	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		List<Book> books = bookService.getByAuthor(author);

		if (books == null)
			return new ArrayList<Book>();
		books = books.stream().sorted((b1, b2) -> b1.getTitle().compareTo(b2.getTitle())).collect(Collectors.toList());

		if (books.isEmpty())
			throw new BookNotFoundException("Books not found");

		return books;
	}

	public String orderBook(int bookId) {
		try {
			Book book = bookService.getById(bookId);
			if (book == null)
				return null;
			return book.getTitle().toUpperCase();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return "Book with this id not found";
	}

	public String addBook(Book book) {
		bookService.addBook(book);
		return "Book Added successfully";
	}
}
