package com.productapp.main;

import java.time.LocalDate;

import com.productapp.model.Category;
import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

public class Client {

	public static void main(String[] args) {
		IProductService service = new ProductServiceImpl();

//		Product[] products = service.getAll();
//
//		for (Product product : products) {
//			System.out.println(product);
//		}

//		Product[] productsByBrand = service.getByBrand("Samsung");
//
//		for (Product product : productsByBrand) {
//			if(product !=null)
//			System.out.println(product);
//		}
//
//		Product[] productsByPrice = service.getByLesserPrice("Mobile",60000);
//
//		for (Product product : productsByPrice) {
//			if(product !=null)
//			System.out.println(product);
//		}

//		String[] productNames = service.getProductNames("LG");
//		for (String productName : productNames) {
//			if (productName != null)
//				System.out.println(productName);
//		}
		
//		Product product = service.getById(1);
//		if(product != null) {
//			System.out.println(product);
//		}
//		else {
//			System.out.println("No Product Found");
//		}
		
//		String[] productNames = service.getCategories("TV");
//		for (String productName : productNames) {
//			if (productName != null)
//				System.out.println(productName);
//		}
		
		Product[] productsWithExpiryDate = service.getByDateBefore("LG", LocalDate.now());
		for (Product product : productsWithExpiryDate) {
			if(product !=null)
				System.out.println(product);
		}

	}

}
