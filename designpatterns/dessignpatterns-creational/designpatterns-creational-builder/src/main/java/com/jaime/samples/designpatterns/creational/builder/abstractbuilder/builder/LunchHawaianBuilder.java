package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder;

import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.Drink;
import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.PizzaHawaian;

public class LunchHawaianBuilder extends LunchBuilder {

	private static String NAME = "Lunch Hawaian";
	private static String DRINK_NAME = Drink.SODA;
	private static float DRINK_PRICE = 1.5f;
	

	public LunchHawaianBuilder() {
		super();
		menu.setName(NAME);
	}
	

	public void buildPizza() {
		menu.setPizza(new PizzaHawaian());
	}
	
	public void buildDrink() {
		menu.setDrink(new Drink());
		menu.getDrink().setName(DRINK_NAME);
		menu.getDrink().setPrice(DRINK_PRICE);
	}
}
