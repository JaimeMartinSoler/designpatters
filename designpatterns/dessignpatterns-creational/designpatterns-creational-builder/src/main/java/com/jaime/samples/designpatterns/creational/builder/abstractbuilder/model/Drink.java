package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model;

public class Drink {

	public static final String COKE = "Coke";
	public static final String ORANGE = "Orange";
	public static final String LEMON = "Lemon";
	public static final String SODA= "Soda";
	public static final String BEER = "Beer";
	public static final String WATER = "Water";

	private String name;
	private float price;

	
	public Drink() {
	}
	
	
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return getName() + " ($" + getPrice() +")";
	}
}
