package com.basics.question;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book("Java Full Course", "Chaitu", 300D);
		
		book.getDetails();
		
		book.checkBookType();
		
		
		Book newBook = new Book("Java Spring", "John", 600D);
		
		newBook.getDetails();
		
		newBook.checkBookType();

	}

}
