package com.jaime.samples.designpatterns.creational.prototype.model;

/*
 * Child Class static final parameters (Under-revision):
 * @see PizzaChicken
 */
public class PizzaHawaian extends Pizza {

	private static final String NAME = "Pizza Hawaian";
	private static final float PRICE = 4.5f;
	private static final int INGREDIENTS_LENGTH = 3;
	private static final Ingredient[] INGREDIENTS = new Ingredient[INGREDIENTS_LENGTH];
	static {
		INGREDIENTS[0] = new Ingredient(Ingredient.TOMATO);
		INGREDIENTS[1] = new Ingredient(Ingredient.CHEESE);
		INGREDIENTS[2] = new Ingredient(Ingredient.PINEAPPLE);
	}
	
	
	public PizzaHawaian() {
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
