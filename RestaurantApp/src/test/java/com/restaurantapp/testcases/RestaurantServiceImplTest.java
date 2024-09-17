package com.restaurantapp.testcases;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.restaurantapp.dao.IRestaurantDao;
import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Category;
import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.FoodType;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.service.RestaurantServiceImpl;

@ExtendWith(MockitoExtension.class)
class RestaurantServiceImplTest {

	@Mock
	IRestaurantDao restaurantDao;

	@InjectMocks
	RestaurantServiceImpl restaurantServiceImpl;

	List<Restaurant> restaurants;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	Restaurant restaurantOne;
	Restaurant restaurantTwo;
	Restaurant restaurantThree;

	@BeforeEach
	void setUp() throws Exception {

		restaurantOne = new Restaurant("IndiaFavourite", FoodType.VEG.name(), 2500, "Vijayawada",
				Category.FIVE.getStartType(), 5, Cuisine.INDIAN.name());
		restaurantOne.setRestaurantId(1);

		restaurantTwo = new Restaurant("ChineseFavourite", FoodType.NON_VEG.name(), 1500, "Bangalore",
				Category.FOUR.getStartType(), 4, Cuisine.CHINESE.name());
		restaurantTwo.setRestaurantId(2);

		restaurantThree = new Restaurant("ItalianFavourite", FoodType.VEG.name(), 1000, "Hyderabad",
				Category.THREE.getStartType(), 3, Cuisine.ITALIAN.name());
		restaurantThree.setRestaurantId(3);

		restaurants = Arrays.asList(restaurantOne, restaurantTwo, restaurantThree);
	}

	@AfterEach
	void tearDown() throws Exception {
		restaurants = null;
		restaurantServiceImpl = null;
		restaurantOne = null;
		restaurantTwo = null;
		restaurantThree = null;
	}

	@Test
	void testGetAll() {

		when(restaurantDao.findAll()).thenReturn(restaurants);

		List<Restaurant> actualrestaurants = restaurantServiceImpl.getAll();

		assertEquals(restaurants, actualrestaurants);
	}

	@Test
	void testGetAllException() {

		when(restaurantDao.findAll()).thenThrow(RestaurantNotFoundException.class);

		assertThrows(RestaurantNotFoundException.class, () -> restaurantServiceImpl.getAll());
	}

	@Test
	void testGetAllNull() {

		when(restaurantDao.findAll()).thenReturn(null);

		assertNull(restaurantServiceImpl.getAll());
	}

	@Test
	void testGetById() {

		int restaurantId = 1;

		doReturn(Optional.of(restaurantOne)).when(restaurantDao).findById(restaurantId);

		Restaurant restaurant = restaurantServiceImpl.getById(restaurantId);

		assertEquals(restaurantOne.getRestaurantName(), restaurant.getRestaurantName());
	}

	@Test
	void testGetByIdException() {

		int restaurantId = 10;

		doThrow(IdNotFoundException.class).when(restaurantDao).findById(restaurantId);

		assertThrows(IdNotFoundException.class, () -> restaurantServiceImpl.getById(restaurantId));
	}

	@Test
	void testGetByCity() {

		String city = "Hyderabad";

		List<Restaurant> expectedRestaurants = Arrays.asList(restaurantThree);

		when(restaurantDao.findByCity(city)).thenReturn(expectedRestaurants);

		List<Restaurant> actualrestaurants = restaurantServiceImpl.getByCity(city);

		assertEquals(expectedRestaurants.size(), actualrestaurants.size());

	}

	@Test
	void testGetByCityException() {

		String city = "Hyderabad";

		when(restaurantDao.findByCity(city)).thenThrow(RestaurantNotFoundException.class);

		assertThrows(RestaurantNotFoundException.class, () -> restaurantServiceImpl.getByCity(city));

	}

	@Test
	void testGetByCuisine() {

		String cuisine = Cuisine.INDIAN.name();

		List<Restaurant> expectedRestaurants = Arrays.asList(restaurantOne);

		when(restaurantDao.findByCuisine(cuisine)).thenReturn(expectedRestaurants);

		List<Restaurant> actualrestaurants = restaurantServiceImpl.getByCuisine(cuisine);

		assertEquals(expectedRestaurants.size(), actualrestaurants.size());

	}

	@Test
	void testGetByCuisineException() {

		String cuisine = Cuisine.INDIAN.name();

		when(restaurantDao.findByCuisine(cuisine)).thenThrow(RestaurantNotFoundException.class);

		assertThrows(RestaurantNotFoundException.class, () -> restaurantServiceImpl.getByCuisine(cuisine));

	}

	@Test
	void testGetByCuisineAndRatings() {
		String cuisine = Cuisine.INDIAN.name();
		int ratings = 5;

		List<Restaurant> expectedRestaurants = Arrays.asList(restaurantOne);

		when(restaurantDao.findByCuisineAndRatings(cuisine, ratings)).thenReturn(expectedRestaurants);

		List<Restaurant> actualrestaurants = restaurantServiceImpl.getByCuisineAndRatings(cuisine, ratings);

		assertEquals(expectedRestaurants.size(), actualrestaurants.size());
	}

	@Test
	void testGetByCuisineAndRatingsException() {
		String cuisine = Cuisine.INDIAN.name();
		int ratings = 6;

		when(restaurantDao.findByCuisineAndRatings(cuisine, ratings)).thenThrow(RestaurantNotFoundException.class);

		assertThrows(RestaurantNotFoundException.class,
				() -> restaurantServiceImpl.getByCuisineAndRatings(cuisine, ratings));
	}

	@Test
	void testGetByCuisineAndType() {
		String cuisine = Cuisine.INDIAN.name();
		String type = FoodType.VEG.name();

		List<String> expectedRestaurants = Arrays.asList("IndiaFavourite");

		when(restaurantDao.findByCuisineAndType(cuisine, type)).thenReturn(expectedRestaurants);

		List<String> actualrestaurants = restaurantServiceImpl.getByCuisineAndType(cuisine, type);

		assertEquals(expectedRestaurants.size(), actualrestaurants.size());
	}
	
	@Test
	void testGetByCostBetween() {
		String type = FoodType.VEG.name();
		double minCost = 500;
		double maxCost = 2500;
		
		List<String> expectedRestaurants = Arrays.asList("IndiaFavourite");

		when(restaurantDao.findByCostBetween(minCost, maxCost, type)).thenReturn(expectedRestaurants);

		List<String> actualrestaurants = restaurantServiceImpl.getByCostBetween(minCost, maxCost, type);

		assertEquals(expectedRestaurants.size(), actualrestaurants.size());
		
	}

}
