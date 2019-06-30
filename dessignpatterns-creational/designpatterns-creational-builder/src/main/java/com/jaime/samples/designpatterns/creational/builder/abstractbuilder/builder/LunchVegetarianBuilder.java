package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder;

import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.Drink;
import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.PizzaVegetarian;

public class LunchVegetarianBuilder extends LunchBuilder {

	private static String NAME = "Lunch Vegetarian";
	private static String DRINK_NAME = Drink.WATER;
	private static float DRINK_PRICE = 1.2f;
	

	public LunchVegetarianBuilder() {
		super();
		menu.setName(NAME);
	}
	

	public void buildPizza() {
		menu.setPizza(new PizzaVegetarian());
	}
	
	public void buildDrink() {
		menu.setDrink(new Drink());
		menu.getDrink().setName(DRINK_NAME);
		menu.getDrink().setPrice(DRINK_PRICE);
	}
	
}
