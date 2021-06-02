/**
 * 
 */
package aClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Peroz Zayee
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // created a Scanner object to assign to the variable sc
		ArrayList<String> pizza_foods = new ArrayList<String>(Arrays.asList("Pepperoni Pizza", "Margherita Pizza", "Hawaiian Pizza"));
		ArrayList<Integer> pizza_prices = new ArrayList<Integer>(Arrays.asList(20, 15, 19));
		PizzaRestaurant pizzaRest = new PizzaRestaurant(pizza_foods, pizza_prices); // created a new restaurant object to assign to the variable
		
		ArrayList<String> burger_foods = new ArrayList<String>(Arrays.asList("Burger", "Kebab", "Sushi"));
		ArrayList<Integer> burger_prices = new ArrayList<Integer>(Arrays.asList(15, 12, 9));
		BurgerRestaurant burgRest = new BurgerRestaurant(burger_foods, burger_prices); // created a new restaurant object to assign to the variable
		String order; // variable to store the user's menu choice
		
		// add the restaurants to the array
		ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(pizzaRest);
		restaurants.add(burgRest);

		do {
			System.out.println("Please enter your order\n");
			order = sc.nextLine().toLowerCase();
			
			// match the string to the appropriate restaurant in restaurants arrayList
			for (int i = 0; i < restaurants.size(); i++) {
				
				// go through the food arrayList for each restaurant
				for (int j = 0; j < restaurants.get(i).getFoods().size(); j++) {
					// check if the current food being looked at is the one the user inputted
					if (order.equals((restaurants.get(i).getFoods().get(j)).toLowerCase())) {
						// store the name of the restaurant and price of food
						String food_name = restaurants.get(i).getFoods().get(j);		// gets the food name
						String rest_name = restaurants.get(i).getRestaurant();			// gets the restaurant name
						int food_price = restaurants.get(i).getPrices().get(j);			// gets the food price for specified food
						
						// system out the restaurant name, food name and price of food
						System.out.println("\n" + rest_name + ", " + food_name + ", $" + food_price + "\n");
					}
				}
			}
			
		}while (!order.equals("exit"));
		System.out.println("Bon apetite!");

	}

}
