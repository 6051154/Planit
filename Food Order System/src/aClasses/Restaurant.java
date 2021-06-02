package aClasses;

import java.util.ArrayList;

public class Restaurant {
	
	private String restaurant;
	private ArrayList<String> foods;
	private ArrayList<Integer> prices;
	
	public Restaurant(ArrayList<String> foods, ArrayList<Integer> prices) {
		this.foods = foods;
		this.prices = prices;
	}
	
	/**
	 * @return the restaurant
	 */
	public String getRestaurant() {
		return restaurant;
	}
	
	/**
	 * @return the foods
	 */
	public ArrayList<String> getFoods() {
		return foods;
	}

	/**
	 * @return the prices
	 */
	public ArrayList<Integer> getPrices() {
		return prices;
	}
}
