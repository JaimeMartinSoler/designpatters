package com.jaime.samples.designpatterns.creational.prototype.model;


public class Ingredient {

	public static final String TOMATO = "Tomato";
	public static final String CHEESE = "Cheese";
	public static final String ONION = "Onion";
	public static final String CHICKEN = "Chicken";
	public static final String PINEAPPLE = "Pineapple";
	
	private String name;


	public Ingredient() {
		this("");
	}
	public Ingredient(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return getName();
	}
}
