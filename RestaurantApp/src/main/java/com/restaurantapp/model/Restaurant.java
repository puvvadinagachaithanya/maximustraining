package com.restaurantapp.model;

public class Restaurant {
	private String restaurantName;
	private String type; // veg or Non-veg enum
	private Integer restaurantId;
	private double costForTow;
	private String city;
	private String category; // 5 star, 3 start etc
	private int ratings;
	private String cuisine; // indian, italian, chinese

	public Restaurant() {
		super();
	}

	public Restaurant(String restaurantName, String type,  double costForTow, String city,
			String category, int ratings, String cuisine) {
		super();
		this.restaurantName = restaurantName;
		this.type = type;
		this.costForTow = costForTow;
		this.city = city;
		this.category = category;
		this.ratings = ratings;
		this.cuisine = cuisine;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public double getCostForTow() {
		return costForTow;
	}

	public void setCostForTow(double costForTow) {
		this.costForTow = costForTow;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", type=" + type + ", restaurantId=" + restaurantId
				+ ", costForTow=" + costForTow + ", city=" + city + ", category=" + category + ", ratings=" + ratings
				+ ", cuisine=" + cuisine + "]";
	}

}
