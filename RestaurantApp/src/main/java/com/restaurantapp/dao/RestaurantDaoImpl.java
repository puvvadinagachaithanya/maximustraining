package com.restaurantapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.restaurantapp.exception.IdNotFoundException;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.util.ConnectionUtil;
import com.restaurantapp.util.Queries;

public class RestaurantDaoImpl implements IRestaurantDao {

	static Connection connection;
	static {
		connection = ConnectionUtil.openConnection();
	}

	@Override
	public void addRestaurant(Restaurant restaurant) {

		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {
			// restaurant_name,city,cost_for_two,type,category,ratings,cuisine
			preparedStatement.setString(1, restaurant.getRestaurantName());
			preparedStatement.setString(2, restaurant.getCity());
			preparedStatement.setDouble(3, restaurant.getCostForTow());
			preparedStatement.setString(4, restaurant.getType());
			preparedStatement.setString(5, restaurant.getCategory());
			preparedStatement.setInt(6, restaurant.getRatings());
			preparedStatement.setString(7, restaurant.getCuisine());
			boolean isAdded = preparedStatement.execute();

			System.out.println(!isAdded ? "Added Successfully" : "Something went wrong");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}

	}

	@Override
	public void updateRestaurant(int restaurantId, double price) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, restaurantId);

			boolean isUpdated = preparedStatement.execute();

			System.out.println(!isUpdated ? "Updated Successfully" : "Something went wrong");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}

	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY);) {

			preparedStatement.setInt(1, restaurantId);

			boolean isdeleted = preparedStatement.execute();

			System.out.println(!isdeleted ? "Deleted Successfully" : "Something went wrong");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}

	}

	@Override
	public Optional<Restaurant> findById(int restaurantId)  {
		// create parepared statement and create single rest object and convert into
		// optional and return
		Restaurant restaurant = null;
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYIDQUERY);) {

			preparedStatement.setInt(1, restaurantId);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				while (resultSet.next()) {
					restaurant = new Restaurant();
					restaurant.setRestaurantName(resultSet.getString("restaurant_name"));
					restaurant.setRestaurantId(resultSet.getInt("restaurant_id"));
					restaurant.setCity(resultSet.getString("city"));
					restaurant.setType(resultSet.getString("type"));
					restaurant.setCuisine(resultSet.getString("cuisine"));
					restaurant.setCostForTow(resultSet.getDouble("cost_for_two"));
					restaurant.setRatings(resultSet.getInt("ratings"));
				}

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return Optional.ofNullable(restaurant);
	}

	@Override
	public List<Restaurant> findAll()  {
		// create prepared, resultset -> iterate and in while loop create rest object
		// and add it to list variable
		// list name restaurants and return list

		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);
				ResultSet resultSet = preparedStatement.executeQuery();) {

			parseResultSet(resultSet, restaurants);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;

	}

	@Override
	public List<Restaurant> findByCity(String city)  {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCITYQUERY);
			preparedStatement.setString(1, city);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				parseResultSet(resultSet, restaurants);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> findByCuisine(String cuisine)  {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCUISINEQUERY);
			preparedStatement.setString(1, cuisine);

			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				parseResultSet(resultSet, restaurants);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<Restaurant> findByCuisineAndRatings(String cuisine, int ratings) {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCUISINEANDRATINGSQUERY);
			preparedStatement.setString(1, cuisine);
			preparedStatement.setInt(2, ratings);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				parseResultSet(resultSet, restaurants);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<String> findByCuisineAndType(String cuisine, String type)  {
		List<String> restaurants = new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCUISINEANDTYPEQUERY);
			preparedStatement.setString(1, cuisine);
			preparedStatement.setString(2, type);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				while (resultSet.next())
					restaurants.add(resultSet.getString("restaurant_name"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<String> findByCategoryAndType(String category, String type)  {
		List<String> restaurants = new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCATEGORYANDTYPEQUERY);
			preparedStatement.setString(1, category);
			preparedStatement.setString(2, type);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				while (resultSet.next())
					restaurants.add(resultSet.getString("restaurant_name"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<String> findByCuisineAndCost(String cuisine, double cost)  {
		List<String> restaurants = new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYCUISINEANDCOSTQUERY);
			preparedStatement.setString(1, cuisine);
			preparedStatement.setDouble(2, cost);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {

				while (resultSet.next())
					restaurants.add(resultSet.getString("restaurant_name"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	@Override
	public List<String> findByCostBetween(double minCost, double maxCost, String type)
			 {
		List<String> restaurants = new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(Queries.FINDBYTYPEANDCOSTDIFFERENCEQUERY);
			preparedStatement.setString(1, type);
			preparedStatement.setDouble(2, minCost);
			preparedStatement.setDouble(3, maxCost);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				while (resultSet.next())
					restaurants.add(resultSet.getString("restaurant_name"));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionUtil.closeConnection();
		}
		return restaurants;
	}

	private List<Restaurant> parseResultSet(ResultSet resultSet, List<Restaurant> restaurants) {
		try {
			while (resultSet.next()) {
				Restaurant restaurant = new Restaurant();
				restaurant.setRestaurantName(resultSet.getString("restaurant_name"));
				restaurant.setRestaurantId(resultSet.getInt("restaurant_id"));
				restaurant.setCity(resultSet.getString("city"));
				restaurant.setType(resultSet.getString("type"));
				restaurant.setCuisine(resultSet.getString("cuisine"));
				restaurant.setCostForTow(resultSet.getDouble("cost_for_two"));
				restaurant.setRatings(resultSet.getInt("ratings"));
				restaurant.setCategory(resultSet.getString("category"));
				restaurants.add(restaurant);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return restaurants;
	}

}
