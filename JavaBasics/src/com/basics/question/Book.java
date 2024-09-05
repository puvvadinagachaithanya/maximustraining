package com.basics.question;

public class Book {
	private String title;
	private String author;
	private double price;

	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void getDetails() {
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.println("Price:" + price);
	}

	void checkBookType() {
		if (price > 500) {
			System.out.println("Premium Book");
		} else {
			System.out.println("Standard Book");
		}
	}

}
