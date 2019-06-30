package com.jaime.samples.designpatterns.creational.abstractfactory.model;

import com.jaime.samples.designpatterns.creational.abstractfactory.model.color.Color;
import com.jaime.samples.designpatterns.creational.abstractfactory.model.shape.Shape;

/*
 * ABSTRACT METHODS:
 *   java does not allow abstract static methods (poor language design).
 *   We could solve this making non-abstract static methods that just return null,
 *   however, java does not allow to override static methods (in Shape/ColorFactory),
 *   so we will have to deal with abstract non-static.
 * 
 * NON-ABSTRACT METHODS:
 *   abstract methods forces all the child factories to override every method
 *   of other factories and import them. It is extremely counter-productive
 *   when adding or modifying new factories. It's  solved with non-abstract methods.
 */
public abstract class AbstractFactory {

	public Color getColor(String description) {
		return null;
	}
	
	public Shape getShape(String description) {
		return null;
	}

}
