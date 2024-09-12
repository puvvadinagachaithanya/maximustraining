package com.list.fun;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.list.custom.Book;

public class BookFunDemo {

	public static void main(String[] args) {

		Book book = new Book("Spring", 10, "Chaitu", "Development", 2500);

		Consumer<Book> bookCon = bookObj -> System.out.println(bookObj);
		bookCon.accept(book);

		Supplier<Book> bookSupplier = () -> book;
		System.out.println(bookSupplier.get());

		Predicate<Book> bookPredicate = pre -> pre.getTitle().equals("Chaitu");
		System.out.println(bookPredicate.test(book));
		
		Function<Book,String> bookFun = bookFunc-> bookFunc.getTitle();
		System.out.println(bookFun.apply(book));
		

	}

}
