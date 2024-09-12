package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {

	public static void main(String[] args) {

		List<Book> bookList = Arrays.asList(new Book("Advance JAVA", 10, "Chaitu", "Development", 40.09),
				new Book("Spring Boot", 15, "Sri Priya", "Development", 56.89),
				new Book("React Full Course", 11, "John Micheal", "Frontend", 150.89),
				new Book("HTML", 20, "Chaitu", "Design", 200), new Book("SQL", 17, "Naresh", "Backend", 180));

		Collections.sort(bookList);

		for (Book book : bookList) {
			System.out.println(book);
		}

		List<Book> bookListByAuthor = new ArrayList<Book>();
		String author = "Chaitu";
		for (Book book : bookList) {
			if (book.getAuthor().equals(author)) {
				bookListByAuthor.add(book);
			}
		}
		System.out.println("Books by author");
		for (Book book : bookListByAuthor) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("Compare sort");
		Collections.sort(bookList, new TitleSort());
		for (Book book : bookList) {
			System.out.println(book);
		}

		System.out.println();

		Collections.sort(bookList, (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));
		for (Book book : bookList) {
			System.out.println(book);
		}

		System.out.println();
		Collections.sort(bookList, (o1, o2) -> ((Double) o1.getPrice()).compareTo(o2.getPrice()));
		for (Book book : bookList) {
			System.out.println(book);
		}

	}

}
