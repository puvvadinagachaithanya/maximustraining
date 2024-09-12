package com.productapp.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.util.ProductUtil;

public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> getAll() {
		return ProductUtil.showProducts();
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		return ProductUtil.showProducts().stream().filter(prod -> prod.getBrand().equals(brand)).toList();
	}

	@Override
	public List<Product> getByLesserPrice(String productName, double price) throws ProductNotFoundException {
		List<Product> productListByPrice = ProductUtil.showProducts().stream()
				.filter(prod -> prod.getPrice() < price && prod.getProductName().equals(productName)).toList();
		if (!productListByPrice.isEmpty()) {
			return productListByPrice;
		}
		throw new ProductNotFoundException("Products Not Found For Provided Price :" + price);
	}

	@Override
	public List<String> getProductNames(String brand) throws ProductNotFoundException {
		List<String> productNameList = ProductUtil.showProducts().stream().filter(prod -> prod.getBrand().equals(brand))
				.map(Product::getProductName).toList();
		if (!productNameList.isEmpty()) {
			return productNameList;
		}
		throw new ProductNotFoundException("Products Not Found For Provided Brand :" + brand);
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		Product product = ProductUtil.showProducts().stream().filter(prod -> prod.getProductId() == productId).findAny()
				.orElseThrow();

		return product;
	}

	@Override
	public List<String> getCategories(String productName) throws ProductNotFoundException {
		return ProductUtil.showProducts().stream().filter(prod -> prod.getProductName().equals(productName))
				.map(prod -> prod.getCategory()).toList();
	}

	@Override
	public List<Product> getByDateBefore(String brand, LocalDate currentDate) throws ProductNotFoundException {
		return ProductUtil.showProducts().stream().filter(prod -> prod.getBrand().equals(brand)
				&& Period.between(currentDate, prod.getExpiryDate()).getDays() > 0).toList();
	}

}
