package com.jaime.samples.designpatterns.creational.prototype.model;

import com.jaime.samples.designpatterns.creational.prototype.prototype.MenuPrototype;

public class PizzaFactory {

	public static Pizza createPizza(String propertyMenu) {
		switch(propertyMenu.toLowerCase()) {
		case MenuPrototype.PROPERTY_MENU_VEGETARIAN:
			return new PizzaVegetarian();
		case MenuPrototype.PROPERTY_MENU_HAWAIAN:
			return new PizzaHawaian();
		case MenuPrototype.PROPERTY_MENU_CHICKEN:
		case MenuPrototype.PROPERTY_MENU_CHICKEN_MAXI_BEER:
			return new PizzaChicken();
		default:
			return null;
		}
	}
	
}
