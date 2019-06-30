package com.jaime.samples.designpatterns.creational.abstractfactory.model.shape;

import com.jaime.samples.designpatterns.creational.abstractfactory.model.AbstractFactory;

/*
 * For other ways to implement a factory, see FACTORY PATTERN
 */
public class ShapeFactory extends AbstractFactory {
	
	/*
	 * with abstract factory is hard to implement it static	
	 * (abstract-static nor override-static is not allowed)
	 */ 
	public Shape getShape(String description) {
		switch(description.toLowerCase()) {
		case "square":
		case "simple":
			return new Square();
		case "rectangle":
			return new Rectangle();
		case "circle":
		case "round":
		case "rounded":
			return new Circle();
		default:
			return null;
		}
   }
	
}
