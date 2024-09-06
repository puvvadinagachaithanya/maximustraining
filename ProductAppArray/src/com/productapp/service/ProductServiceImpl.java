package com.productapp.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import com.productapp.model.Product;
import com.productapp.util.ProductUtil;

public class ProductServiceImpl implements IProductService {

	@Override
	public Product[] getAll() {
		return ProductUtil.showProducts();
	}

	@Override
	public Product[] getByBrand(String brand) {
		Product[] products = ProductUtil.showProducts();
		Product[] productsByBrand = new Product[products.length - 1];
		int i = 0;
		for (Product product : products) {
			if (product.getBrand().equals(brand)) {
				productsByBrand[i] = product;
				i++;
			}
		}
		return productsByBrand;
	}

	@Override
	public Product[] getByLesserPrice(String productName, double price) {
		Product[] products = ProductUtil.showProducts();
		Product[] productsByPrice = new Product[products.length - 1];
		int i = 0;
		for (Product product : products) {
			if (product.getPrice() < price && product.getProductName().equals(productName)) {
				productsByPrice[i] = product;
				i++;
			}
		}
		return productsByPrice;
	}

	@Override
	public String[] getProductNames(String brand) {
		Product[] products = ProductUtil.showProducts();
		String[] productNames = new String[products.length - 1];
		int i = 0;
		for (Product product : products) {
			if (product.getBrand().equals(brand)) {
				productNames[i] = product.getProductName();
				i++;
			}
		}
		return productNames;
	}

	@Override
	public Product getById(int productId) {
		Product[] products = ProductUtil.showProducts();
		for (Product product : products) {
			if (product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;
	}

	@Override
	public String[] getCategories(String productName) {
		Product[] products = ProductUtil.showProducts();
		String[] productNames = new String[products.length - 1];
		int i = 0;
		for (Product product : products) {
			if (product.getProductName().equals(productName)) {
				productNames[i] = product.getCategory();
				i++;
			}
		}
		return productNames;
	}

	@Override
	public Product[] getByDateBefore(String brand, LocalDate currentDate) {
		Product[] products = ProductUtil.showProducts();
		Product[] productsWithExpiryDate = new Product[products.length - 1];
		int i = 0;
		for (Product product : products) {
			if (product.getBrand().equals(brand)
					&& Period.between(currentDate, product.getExpiryDate()).getDays() > 0) {
					//&& product.getExpiryDate().isAfter(currentDate)){
				productsWithExpiryDate[i] = product;
				i++;
			
			}
		}
		return productsWithExpiryDate;
	}

}
