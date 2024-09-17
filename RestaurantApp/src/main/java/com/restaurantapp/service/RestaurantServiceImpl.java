package com.restaurantapp.service;

import java.util.List;
import java.util.Optional;

import com.restaurantapp.dao.IRestaurantDao;
import com.restaurantapp.dao.RestaurantDaoImpl;
import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public class RestaurantServiceImpl implements IRestaurantService {

	// handle exception
	private IRestaurantDao restaurantDao = new RestaurantDaoImpl();

	@Override
	public void addRestaurant(Restaurant restaurant) {
		restaurantDao.addRestaurant(restaurant);
	}

	@Override
	public void updateRestaurant(int restaurantId, double price) {
		restaurantDao.updateRestaurant(restaurantId, price);

	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		restaurantDao.deleteRestaurant(restaurantId);
	}

	@Override
	public Restaurant getById(int restaurantId) throws IdNotFoundException {
		Optional<Restaurant> restaurant = restaurantDao.findById(restaurantId);
		return restaurant
				.orElseThrow(() -> new IdNotFoundException("Restaurant not found for provided id :" + restaurantId));

	}

	@Override
	public List<Restaurant> getAll() throws RestaurantNotFoundException {
		return restaurantDao.findAll();
	}

	@Override
	public List<Restaurant> getByCity(String city) throws RestaurantNotFoundException {
		List<Restaurant> restaurants = restaurantDao.findByCity(city);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException("Data not availale for provided city :" + city);
	}

	@Override
	public List<Restaurant> getByCuisine(String cuisine) throws RestaurantNotFoundException {
		List<Restaurant> restaurants = restaurantDao.findByCuisine(cuisine);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException("Data not availale for provided cuisine :" + cuisine);
	}

	@Override
	public List<Restaurant> getByCuisineAndRatings(String cuisine, int ratings) throws RestaurantNotFoundException {
		List<Restaurant> restaurants = restaurantDao.findByCuisineAndRatings(cuisine, ratings);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException(
				"Data not availale for provided cuisine and ratings :" + cuisine + " " + ratings);
	}

	@Override
	public List<String> getByCuisineAndType(String cuisine, String type) throws RestaurantNotFoundException {
		List<String> restaurants = restaurantDao.findByCuisineAndType(cuisine, type);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException(
				"Data not availale for provided cuisine and type :" + cuisine + " " + type);
	}

	@Override
	public List<String> getByCategoryAndType(String category, String type) throws RestaurantNotFoundException {
		List<String> restaurants = restaurantDao.findByCategoryAndType(category, type);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException(
				"Data not availale for provided category and type :" + category + " " + type);
	}

	@Override
	public List<String> getByCuisineAndCost(String cuisine, double cost) throws RestaurantNotFoundException {
		List<String> restaurants = restaurantDao.findByCuisineAndCost(cuisine, cost);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException(
				"Data not availale for provided cuisine and cost :" + cuisine + " " + cost);
	}

	@Override
	public List<String> getByCostBetween(double minCost, double maxCost, String type)
			throws RestaurantNotFoundException {
		List<String> restaurants = restaurantDao.findByCostBetween(minCost, maxCost, type);
		if (!restaurants.isEmpty())
			return restaurants;
		throw new RestaurantNotFoundException(
				"Data not availale for provided type and cost :" + type + " " + maxCost);
	}

}
