package com.jaime.samples.designpatterns.creational.prototype.model;

/*
 * Child Class static final parameters (Under-revision):
 * @see PizzaChicken
 */
public class PizzaVegetarian  extends Pizza {

	private static final String NAME = "Pizza Vegetarian";
	private static final float PRICE = 3.5f;
	private static final int INGREDIENTS_LENGTH = 3;
	private static final Ingredient[] INGREDIENTS = new Ingredient[INGREDIENTS_LENGTH];
	static {
		INGREDIENTS[0] = new Ingredient(Ingredient.TOMATO);
		INGREDIENTS[1] = new Ingredient(Ingredient.CHEESE);
		INGREDIENTS[2] = new Ingredient(Ingredient.ONION);
	}
	
	
	public PizzaVegetarian() {
		super();
	}
	
	
	@Override
	public String getName() {
		return NAME;
	}
	@Override
	public float getPrice() {
		return PRICE;
	}
	@Override
	public Ingredient[] getIngredients() {
		return INGREDIENTS;
	}
}