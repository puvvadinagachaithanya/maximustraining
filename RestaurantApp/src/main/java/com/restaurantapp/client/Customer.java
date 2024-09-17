package com.restaurantapp.client;

import java.util.List;
import java.util.Optional;

import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.FoodType;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.service.IRestaurantService;
import com.restaurantapp.service.RestaurantServiceImpl;
import com.restaurantapp.util.ConnectionUtil;

public class Customer {

	public static void main(String[] args) {

		try {
			IRestaurantService restaurantService = new RestaurantServiceImpl();

			Restaurant restaurant = new Restaurant("IndiaFavourite", FoodType.NON_VEG.name(), 2500, "Vijayawada",
					Category.FIVE.getStartType(), 5, Cuisine.ITALIAN.name());

			// adding record
			 //restaurantService.addRestaurant(restaurant);

			// updating record
			// restaurantService.updateRestaurant(1, 1500);

			// deleting record
			// restaurantService.deleteRestaurant(3);

			// get restaurant by id
			// restaurant = restaurantService.getById(1);

			 List<Restaurant> restaurants = restaurantService.getAll();

			//List<Restaurant> restaurants = restaurantService.getByCity("Chennai");
			
			//List<Restaurant> restaurants = restaurantService.getByCuisineAndRatings("INDIAN",4);
			
			//List<String> restaurants = restaurantService.getByCostBetween(500, 2000, "VEG");
			
			//List<String> restaurants = restaurantService.getByCuisineAndType("INDIAN", "VEG");
			
			restaurants.stream().forEach(System.out::println);

			//System.out.println(restaurant);
		} catch (IdNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (RestaurantNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
