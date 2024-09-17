package com.restaurantapp.dao;

import java.util.List;
import java.util.Optional;

import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public interface IRestaurantDao {
	void addRestaurant(Restaurant restaurant);

	void updateRestaurant(int restaurantId, double price);

	void deleteRestaurant(int restaurantId);

	Optional<Restaurant> findById(int restaurantId) ;

	List<Restaurant> findAll() ;

	List<Restaurant> findByCity(String city) ;

	List<Restaurant> findByCuisine(String cuisine) ;

	List<Restaurant> findByCuisineAndRatings(String cuisine, int ratings);

	List<String> findByCuisineAndType(String cuisine, String type) ;

	List<String> findByCategoryAndType(String category, String type) ;

	List<String> findByCuisineAndCost(String cuisine, double cost) ;

	List<String> findByCostBetween(double minCost, double maxCost, String type) ;
}
