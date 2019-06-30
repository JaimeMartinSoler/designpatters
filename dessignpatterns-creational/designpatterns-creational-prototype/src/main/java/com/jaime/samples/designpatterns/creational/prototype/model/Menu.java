package com.jaime.samples.designpatterns.creational.prototype.model;

/*
 * 	Menu:
 * 	- Drink (concrete, with public-static-final parameters to define it)
 * 	- Pizza (abstract, child classes define the object):
 * 	  (PizzaChicken)
 *    (PizzaVegetarian)
 * 	  (PizzaHawaian)
 * 	  - Ingredient[] (concrete, with public-static-final parameters to define it)
 */
public class Menu implements Cloneable {

	private String name;
	private Pizza pizza;
	private Drink drink;
	
	
	public Menu() {
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
		return pizza.getPrice() + drink.getPrice();
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
		String str = getName() + " ($" + getPrice() +"):\n";
		String indent = "    ";
		str += indent + pizza.toString() + "\n";
		str += indent + drink.toString();
		return str;
	}

	@Override
	public Object clone() {
	   Object clone = null;
	   try {
		   clone = super.clone();    
	   } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
	   }
	   return clone;
	}
	
}
