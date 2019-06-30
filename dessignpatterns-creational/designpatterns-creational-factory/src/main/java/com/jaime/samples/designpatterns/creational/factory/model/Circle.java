package com.jaime.samples.designpatterns.creational.factory.model;

public class Circle extends Shape {
	
	@Override
	public String getFormulaArea() {
		return "circle: area=PI*r^2";
	}
	
}
