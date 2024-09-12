package com.productapp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

public interface IProductService {
	List<Product> getAll();

	List<Product> getByBrand(String brand) throws ProductNotFoundException;

	List<Product> getByLesserPrice(String productName, double price) throws ProductNotFoundException;

	List<String> getProductNames(String brand) throws ProductNotFoundException;

	Product getById(int productId) throws ProductNotFoundException;

	List<String> getCategories(String productName) throws ProductNotFoundException;
	
	//if the current date is lesser than the expiry date

	List<Product> getByDateBefore(String brand, LocalDate currentDate) throws ProductNotFoundException;
}
