package com.productapp.util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.productapp.model.Category;
import com.productapp.model.Product;

public class ProductUtil {
	public static List<Product> showProducts() {
		String electronics = Category.ELECTRONICS.name();
		String mobiles = Category.MOBILES.name();
		String gadgets = Category.GADGETS.name();
		String homeAppliances = Category.HOMEAPPLIANCES.name();
		String musicSystems = Category.MUSICSYSTEMS.name();
		return Arrays.asList(new Product("Mobile", 1, "Samsung", mobiles, 25000D, LocalDate.of(2024, 12, 10)),
				new Product("TV", 2, "LG", electronics, 15000D, LocalDate.of(2024, 11, 10)),
				new Product("Wallet", 3, "Titan", gadgets, 5000D, LocalDate.of(2025, 02, 18)),
				new Product("HeadPhones", 4, "Bose", musicSystems, 3000D, LocalDate.of(2024, 10, 11)),
				new Product("Refregirator", 5, "LG", homeAppliances, 18000D, LocalDate.of(2024, 12, 20)),
				new Product("Laptop", 6, "Dell", electronics, 40000D, LocalDate.of(2024, 12, 25)),
				new Product("Mobile", 7, "Vivo", mobiles, 18000D, LocalDate.of(2024, 11, 15)));

	}
}
