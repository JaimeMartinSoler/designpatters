package com.jaime.samples.designpatterns.creational.builder.prototype.builder;

import com.jaime.samples.designpatterns.creational.builder.craftbuilder.model.Drink;
import com.jaime.samples.designpatterns.creational.builder.craftbuilder.model.Menu;
import com.jaime.samples.designpatterns.creational.builder.craftbuilder.model.PizzaChicken;
import com.jaime.samples.designpatterns.creational.builder.craftbuilder.model.PizzaVegetarian;

/*
 * CRAFT BUILDER:
 * https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * 
 * I think this is the most useful and intuitive Builder Pattern
 * The Builder here solves this paradigm:
 * - There are many concrete classes under many parent classes
 * - There are many parameters for every object to be build
 * - The final 'client' (the user of Menu object) doesn't need
 *   so many customization, it actually need just a few final object
 *   ('Menu Vegetarian', 'Menu Chicken', ...)
 * The MenuBuilder automates this by providing builder methods.
 */
public class MenuBuilder {

	public static Menu buildMenuVegetarian() {
		Menu menu = new Menu();
		menu.setName("Menu Vegetarian");
		menu.setPizza(new PizzaVegetarian());
		menu.setDrink(new Drink());
		menu.getDrink().setName(Drink.WATER);
		menu.getDrink().setPrice(1.2f);
		return menu;
	}
	
	public static Menu buildMenuChicken() {
		Menu menu = new Menu();
		menu.setName("Menu Chicken");
		menu.setPizza(new PizzaChicken());
		menu.setDrink(new Drink());
		menu.getDrink().setName(Drink.BEER);
		menu.getDrink().setPrice(1.5f);
		return menu;
	}
	
	public static Menu buildMenuChickenMaxiBeer() {
		Menu menu = new Menu();
		menu.setName("Menu Chicken Maxi Beer");
		menu.setPizza(new PizzaChicken());
		menu.setDrink(new Drink());
		menu.getDrink().setName(Drink.BEER);
		menu.getDrink().setPrice(5.0f);
		return menu;
	}
}
