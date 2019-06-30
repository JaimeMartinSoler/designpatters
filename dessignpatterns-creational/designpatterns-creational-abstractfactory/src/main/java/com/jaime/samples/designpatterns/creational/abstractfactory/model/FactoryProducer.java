package com.jaime.samples.designpatterns.creational.abstractfactory.model;

import com.jaime.samples.designpatterns.creational.abstractfactory.model.color.ColorFactory;
import com.jaime.samples.designpatterns.creational.abstractfactory.model.shape.ShapeFactory;

// The mother class can be whether an abstract class or an interface
public abstract class FactoryProducer {
	
	public static AbstractFactory getFactory(String description) {
		
		description = description.toLowerCase();
		
		switch(description) {
		case "color":
			return new ColorFactory();
		case "shape":
			return new ShapeFactory();
		default:
			return null;
		}
   }
	
}
