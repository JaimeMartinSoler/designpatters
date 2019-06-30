package com.jaime.samples.designpatterns.creational.abstractfactory.model.shape;

public class Circle extends Shape {
	
	@Override
	public String getFormulaArea() {
		return "circle: area=PI*r^2";
	}
	
}
