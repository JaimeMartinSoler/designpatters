package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder;

import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.Drink;
import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.PizzaChicken;

public class LunchChickenBuilder extends LunchBuilder {

	private static String NAME = "Lunch Chicken";
	private static String DRINK_NAME = Drink.BEER;
	private static float DRINK_PRICE = 1.5f;
	private static float DRINK_MAXI_BEER_PRICE = 5.0f;
	

	public LunchChickenBuilder() {
		super();
		menu.setName(NAME);
	}
	

	public void buildPizza() {
		menu.setPizza(new PizzaChicken());
	}

	public void buildDrink() {
		menu.setDrink(new Drink());
		menu.getDrink().setName(DRINK_NAME);
		menu.getDrink().setPrice(DRINK_PRICE);
	}
	
	public void buildDrinkMaxiBeer() {
		menu.setDrink(new Drink());
		menu.getDrink().setName(DRINK_NAME);
		menu.getDrink().setPrice(DRINK_MAXI_BEER_PRICE);
	}
}
