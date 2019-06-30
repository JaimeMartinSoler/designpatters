package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model;


public abstract class Pizza {
	
	
	public Pizza() {
	}
	
	
	public abstract String getName();
	public abstract float getPrice();
	public abstract Ingredient[] getIngredients();

	@Override
	public String toString() {
		String str = getName() + " ($" + getPrice() +") [";
		String ingredientSeparator = ", ";
		for (Ingredient ingredient : getIngredients()) {
			str += ingredient.toString() + ingredientSeparator;
		}
		str = str.substring(0,str.length()-ingredientSeparator.length());
		str += "]";
		return str;
	}
	
}
