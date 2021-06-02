/**
 * 
 */
package aClasses;

import java.util.ArrayList;

/**
 * @author Peroz Zayee
 *
 */
public class PizzaRestaurant extends Restaurant {
	// instance variables
	private String restaurant = "Awesome Pizza Place";
	private ArrayList<String> foods = new ArrayList<String>();
	private ArrayList<Integer> prices = new ArrayList<Integer>();

	/**
	 * @param foods
	 * @param prices
	 */
	public PizzaRestaurant(ArrayList<String> foods, ArrayList<Integer> prices) {
		super(foods, prices);
	}

	public String getRestaurant() {
		return restaurant;
	}

}
