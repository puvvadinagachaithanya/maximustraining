package com.restaurantapp.util;

public class Queries {
	public static final String CREATEQUERY = """
			create table restaurant(
			 restaurant_name varchar(20),
			 restaurant_id int primary key auto_increment,
			 city varchar(20),
			 cuisine varchar(20),
			 cost_for_two double,
			 type varchar(20),
			 category varchar(20),
			 ratings int )
			""";

	public static final String INSERTQUERY = """
			insert into restaurant(restaurant_name,city,cost_for_two,type,category,ratings,cuisine)
			values(?,?,?,?,?,?,?)
			""";

	public static final String UPDATEQUERY = "update restaurant set cost_for_two=? where restaurant_id=?";

	public static final String DELETEQUERY = "delete from restaurant where restaurant_id=?";

	public static final String FINDBYIDQUERY = "select * from restaurant where restaurant_id=?";
	
	public static final String GETALLQUERY = "select * from restaurant";
	
	public static final String FINDBYCITYQUERY = "select * from restaurant where city=?";
	
	public static final String FINDBYCUISINEQUERY = "select * from restaurant where cuisine=?";
	
	public static final String FINDBYCUISINEANDRATINGSQUERY = "select * from restaurant where cuisine=? and ratings=?";
	
	public static final String FINDBYCUISINEANDTYPEQUERY = "select restaurant_name from restaurant where cuisine=? and type=?";
	
	public static final String FINDBYCATEGORYANDTYPEQUERY = "select restaurant_name from restaurant where category=? and type=?";
	
	public static final String FINDBYCUISINEANDCOSTQUERY = "select restaurant_name from restaurant where cuisine=? and cost_for_two=?";
	
	public  static final String FINDBYTYPEANDCOSTDIFFERENCEQUERY = "select restaurant_name from restaurant where type = ? and cost_for_two between ? and ?";

}
