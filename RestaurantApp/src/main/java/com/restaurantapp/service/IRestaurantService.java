package com.restaurantapp.service;

import java.util.List;

import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public interface IRestaurantService {

	void addRestaurant(Restaurant restaurant);

	void updateRestaurant(int restaurantId, double price);

	void deleteRestaurant(int restaurantId);

	Restaurant getById(int restaurantId) throws IdNotFoundException;

	List<Restaurant> getAll() throws RestaurantNotFoundException;

	List<Restaurant> getByCity(String city) throws RestaurantNotFoundException;

	List<Restaurant> getByCuisine(String cuisine) throws RestaurantNotFoundException;

	List<Restaurant> getByCuisineAndRatings(String cuisine, int ratings) throws RestaurantNotFoundException;

	List<String> getByCuisineAndType(String cuisine, String type) throws RestaurantNotFoundException;

	List<String> getByCategoryAndType(String category, String type) throws RestaurantNotFoundException;

	List<String> getByCuisineAndCost(String cuisine, double cost) throws RestaurantNotFoundException;

	List<String> getByCostBetween(double minCost, double maxCost, String type) throws RestaurantNotFoundException;

}
