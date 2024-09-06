package com.productapp.service;

import java.time.LocalDate;

import com.productapp.model.Product;

public interface IProductService {
	Product[] getAll();

	Product[] getByBrand(String brand);

	Product[] getByLesserPrice(String productName, double price);

	String[] getProductNames(String brand);

	Product getById(int productId);

	String[] getCategories(String productName);
	
	//if the current date is lesser than the expiry date

	Product[] getByDateBefore(String brand, LocalDate currentDate);
}
