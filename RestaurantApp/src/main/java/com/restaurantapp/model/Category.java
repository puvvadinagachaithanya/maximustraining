package com.restaurantapp.model;

public enum Category {
	
	ONE("1-STAR"),
	TWO("2-STAR"),
	THREE("3-STAR"),
	FOUR("4-STAR"),
	FIVE("5-STAR");
	
	private  String starType;

	private Category(String starType) {
		this.starType = starType;
	}
	
	public  String getStartType() {
		return starType;
	}
	
}
