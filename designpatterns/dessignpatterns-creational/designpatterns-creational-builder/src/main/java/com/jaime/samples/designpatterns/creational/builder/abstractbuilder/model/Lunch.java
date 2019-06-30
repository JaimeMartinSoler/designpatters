package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model;

/*
 * 	Lunch:
 * 	- Drink (concrete, with public-static-final parameters to define it)
 * 	- Pizza (abstract, child classes define the object):
 * 	  (PizzaChicken)
 *    (PizzaVegetarian)
 * 	  (PizzaHawaian)
 * 	  - Ingredient[] (concrete, with public-static-final parameters to define it)
 */
public class Lunch {

	private String name;
	private Pizza pizza;
	private Drink drink;
	
	
	public Lunch() {
	}
	

	public String getName() {
		return name;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public Drink getDrink() {
		return drink;
	}
	public float getPrice() {
		float price = 0.0f;
		try {
			price += pizza.getPrice();
		} catch (NullPointerException e) {
		}
		try {
			price += drink.getPrice();
		} catch (NullPointerException e) {
		}
		return price;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		String str = getName() + " ($" + getPrice() +"):";
		String indent = "    ";
		try {
			str += "\n" + indent + pizza.toString();
		} catch (NullPointerException e) {
		}
		try {
			str += "\n" + indent + drink.toString();
		} catch (NullPointerException e) {
		}
		return str;
	}
}
