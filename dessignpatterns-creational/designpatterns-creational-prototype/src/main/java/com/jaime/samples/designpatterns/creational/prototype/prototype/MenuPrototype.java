package com.jaime.samples.designpatterns.creational.prototype.prototype;

import java.util.Hashtable;

import com.jaime.samples.designpatterns.creational.prototype.filereader.PropertyReader;
import com.jaime.samples.designpatterns.creational.prototype.model.Drink;
import com.jaime.samples.designpatterns.creational.prototype.model.Menu;
import com.jaime.samples.designpatterns.creational.prototype.model.PizzaFactory;


public class MenuPrototype {

	public static final String KEY_MENU_VEGETARIAN = "MENU_VEGETARIAN";
	public static final String KEY_MENU_CHICKEN = "MENU_CHICKEN";
	public static final String KEY_MENU_CHICKEN_MAXI_BEER = "MENU_CHICKEN_MAXI_BEER";
	
	public static final String PROPERTY_MENU_VEGETARIAN = "vegetarian";
	public static final String PROPERTY_MENU_HAWAIAN = "hawaian";
	public static final String PROPERTY_MENU_CHICKEN = "chicken";
	public static final String PROPERTY_MENU_CHICKEN_MAXI_BEER = "chickenmaxibeer";
	
	private static Hashtable<String, Menu> menuCache  = new Hashtable<String, Menu>();

	/**
	 * Uses the Menu.clone() and the Hashtable to create a new object
	 * cloned from a prototype given by the key
	 */
	public static Menu getMenu(String menuKey) {
		return (Menu) menuCache.get(menuKey).clone();
	}
	
	/**
	 * This is the process that PROTOTYPE PATTERN optimizes, being necessary just once,
	 * meant to be implemented when this load is heavy (like in this case, with file access),
	 * so we want to avoid it being made every time we need an object to be built.
	 * 
	 * Note that we can make the prototypes load dynamic by calling loadPrototypes()
	 * whenever we need to re-load the prototypes from the file
	 */
	public static void loadPrototypes() {
		menuCache.clear();
		menuCache.put(KEY_MENU_VEGETARIAN, buildMenuFromProperties(PROPERTY_MENU_VEGETARIAN));
		menuCache.put(KEY_MENU_CHICKEN, buildMenuFromProperties(PROPERTY_MENU_CHICKEN));
		menuCache.put(KEY_MENU_CHICKEN_MAXI_BEER, buildMenuFromProperties(PROPERTY_MENU_CHICKEN_MAXI_BEER));
	}
	
	private static Menu buildMenuFromProperties(String menuName) {
		
		String propertyMenuName = "menu." + menuName + ".name";
		String propertyMenuDrinkName = "menu." + menuName + ".drink.name";
		String propertyMenuDrinkPrice = "menu." + menuName + ".drink.price";

		final PropertyReader propertyReader = new PropertyReader();
		
		Menu menu = new Menu();
		menu.setName(propertyReader.getPropertyValue(propertyMenuName));
		menu.setPizza(PizzaFactory.createPizza(menuName));
		menu.setDrink(new Drink());
		menu.getDrink().setName(propertyReader.getPropertyValue(propertyMenuDrinkName));
		menu.getDrink().setPrice(Float.parseFloat(propertyReader.getPropertyValue(propertyMenuDrinkPrice)));
		
		return menu;
	}

}
