package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model;

/*
 * Child Class static final parameters (Under-revision):
 * 
 * We could return (i.e.) "Pizza Chicken" directly in getName(),
 * without the need of the NAME parameter.
 * 
 * However, with larger classes with other types of methods (private, abstract, child-specific),
 * it could be a bit messy to find them.
 * 
 * This way we provide a child-configuration zone on top of the class,
 * clean for every child-class, and the methods that uses them are the same for every child-class
 */
public class PizzaChicken extends Pizza {

	private static final String NAME = "Pizza Chicken";
	private static final float PRICE = 4.0f;
	private static final int INGREDIENTS_LENGTH = 4;
	private static final Ingredient[] INGREDIENTS = new Ingredient[INGREDIENTS_LENGTH];
	static {
		INGREDIENTS[0] = new Ingredient(Ingredient.TOMATO);
		INGREDIENTS[1] = new Ingredient(Ingredient.CHEESE);
		INGREDIENTS[2] = new Ingredient(Ingredient.ONION);
		INGREDIENTS[3] = new Ingredient(Ingredient.CHICKEN);
	}
	
	
	public PizzaChicken() {
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
