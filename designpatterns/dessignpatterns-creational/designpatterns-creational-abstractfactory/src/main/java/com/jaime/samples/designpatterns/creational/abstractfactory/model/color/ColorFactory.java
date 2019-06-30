package com.jaime.samples.designpatterns.creational.abstractfactory.model.color;

import com.jaime.samples.designpatterns.creational.abstractfactory.model.AbstractFactory;

/*
 * For other ways to implement a factory, see FACTORY PATTERN
 */
public class ColorFactory extends AbstractFactory {

	/*
	 * with abstract factory is hard to implement it static	
	 * (abstract-static nor override-static is not allowed)
	 */ 
	@Override
	public Color getColor(String description) {
		switch(description.toLowerCase()) {
		case "red":
		case "passion":
		case "hot":
			return new Red();
		case "green":
		case "grass":
		case "hope":
			return new Green();
		case "blue":
		case "sea":
		case "ocean":
		case "cold":
		case "cool":
			return new Blue();
		default:
			return null;
		}
   }
	
}
