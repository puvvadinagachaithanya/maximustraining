package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.OrderDetails;

@ExtendWith(MockitoExtension.class)
class OrderDetailsTest {

	@InjectMocks
	OrderDetails orderDetails; // creating and injecting

	@Mock
	IBookService bookService; // creating a proxy

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	Book book1, book2, book3, book4, book5;

	@BeforeEach
	void setUp() throws Exception {

		book1 = new Book(1, "Java", "Kathy", 900);
		book2 = new Book(2, "Css", "Chaitu", 200);
		book3 = new Book(3, "Seven Habits", "Steve", 300);
		book4 = new Book(4, "5am club", "Robin", 800);
		book5 = new Book(5, "Spring", "Chaitu", 1000);
	}

	@AfterEach
	void tearDown() throws Exception {
		orderDetails = null;
		book1 = null;
		book2 = null;
		book3 = null;
		book4 = null;
		book5 = null;
	}

	@Test
	void testFindByAuthor() {
		String author = "Chaitu";
		List<Book> expectedBooks = Arrays.asList(book2, book5);
		when(bookService.getByAuthor(author)).thenReturn(expectedBooks);
		List<Book> actualBooks = orderDetails.findByAuthor(author);
		assertEquals(expectedBooks, actualBooks);

	}
	
	@Test
	void testFindByAuthorEmpty() {
		String author = "testing";

		when(bookService.getByAuthor(author)).thenReturn(new ArrayList<Book>());

		assertThrows(BookNotFoundException.class, () -> orderDetails.findByAuthor(author));

	}

	@Test
	void testFindByAuthorException() {
		String author = "testing";

		when(bookService.getByAuthor(author)).thenThrow(BookNotFoundException.class);

		assertThrows(BookNotFoundException.class, () -> bookService.getByAuthor(author));

	}
	
	@Test
	void testFindByAuthorNull() {
		String author = "Chaitu";
		List<Book> expectedBooks = Arrays.asList(book2, book5);

		when(bookService.getByAuthor(author)).thenReturn(null);

		List<Book> actualBooks = orderDetails.findByAuthor(author);
		
		assertEquals(new ArrayList<>(), actualBooks);

	}
	
	@Test
	void testOrderBook() {
		
		int bookId = 1;
		//return book object
		doReturn(book1).when(bookService).getById(bookId);
		
		String title = orderDetails.orderBook(bookId);
		
		assertEquals(book1.getTitle().toUpperCase(), title);
	}

	@Test
	void testOrderBookNull() {
		
		int bookId = 10;
		//return book object
		doReturn(null).when(bookService).getById(bookId);
		
		String title = orderDetails.orderBook(bookId);
		
		assertNull(title);
	}
	
	@Test
	void testOrderBookException() {
		
		int bookId = 1;
		//return book object
		doThrow(BookNotFoundException.class).when(bookService).getById(bookId);
		
		String title = orderDetails.orderBook(bookId);
		
		assertEquals("Book with this id not found", title);
	}
	
	@Test
	void testaddBook() {
		
		//return book object
		doNothing().when(bookService).addBook(book1);
		
		String title = orderDetails.addBook(book1);
		
		assertEquals("Book Added successfully", title);
	}
}
