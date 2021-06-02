/**
 * 
 */
package aClasses;

import java.util.ArrayList;

/**
 * @author Peroz Zayee
 *
 */
public class BurgerRestaurant extends Restaurant {
	// instance variables
	private String restaurant = "Wild Burger Joint";
	private ArrayList<String> foods = new ArrayList<String>();
	private ArrayList<Integer> prices = new ArrayList<Integer>();

	/**
	 * @param foods
	 * @param prices
	 */
	public BurgerRestaurant(ArrayList<String> foods, ArrayList<Integer> prices) {
		super(foods, prices);
	}

	public String getRestaurant() {
		return restaurant;
	}

}
