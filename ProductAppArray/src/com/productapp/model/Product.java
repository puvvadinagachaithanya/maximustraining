package com.productapp.model;

import java.time.LocalDate;

public class Product {
	private String productName;
	private Integer productId;
	private String brand;
	private String category;
	private double price;
	private LocalDate expiryDate;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, Integer productId, String brand, String category, double price,
			LocalDate expiryDate) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", brand=" + brand + ", category="
				+ category + ", price=" + price + ", expiryDate=" + expiryDate + "]";
	}
	
	
	
}
