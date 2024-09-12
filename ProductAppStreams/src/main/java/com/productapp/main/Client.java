package com.productapp.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Category;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Client {

	public static void main(String[] args) {
		IProductService service = new ProductServiceImpl();

		List<Product> products = service.getAll();
		products.stream().forEach(prod -> System.out.println(prod));

		System.out.println();
		try {
			products = service.getByBrand("LG");
			products.forEach(prod -> System.out.println(prod));

			System.out.println();
			products = service.getByLesserPrice("Mobile", 60000);

			products.forEach(prod -> System.out.println(prod));

			System.out.println();

			List<String> productNames = service.getProductNames("LG");
			productNames.forEach(System.out::println);

			System.out.println();

			products = service.getByDateBefore("Titan", LocalDate.now());
			products.forEach(System.out::println);

			System.out.println();

			Product product = service.getById(10);
			System.out.println(product);

		} catch (ProductNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
