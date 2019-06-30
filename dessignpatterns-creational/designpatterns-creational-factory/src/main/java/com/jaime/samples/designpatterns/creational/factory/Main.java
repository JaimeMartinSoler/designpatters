package com.jaime.samples.designpatterns.creational.factory;

import com.jaime.samples.designpatterns.creational.factory.model.Rectangle;
import com.jaime.samples.designpatterns.creational.factory.model.Shape;
import com.jaime.samples.designpatterns.creational.factory.model.ShapeFactory;

/*
 * FACTORY PATTERN
 *   https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

 * Note that Factories provide empty/default objects, while
 * Builders provide filled/setted objects according to a propose.
 * 
 * It lets us create objects that extend a mother class/interface:
 * - Without knowing the creation logic behind each object,
 *   even the name of the class can be unknown, other names can be used instead
 * - Limiting the number of dependencies to just the mother class and the factory
 * 
 * Note that:
 * - Hiding the creation logic hides code-intent, could be harder to read/understand
 * - Can be substituted by Inversion of Control frameworks
 * - Not used extensively
 */
public class Main {

	public static void main(String[] args) {

		Shape shapeRounded = ShapeFactory.getShape("rounded");
		Shape shapeSimple = ShapeFactory.createSquare();
		Shape shapeRectangle = ShapeFactory.getShape(Rectangle.class);

		System.out.println("FACTORY PATTERN");
		System.out.println(shapeRounded.getFormulaArea());
		System.out.println(shapeSimple.getFormulaArea());
		System.out.println(shapeRectangle.getFormulaArea());
	}
	
}

/* output:
FACTORY PATTERN
circle: area=PI*r^2
square: area=l^2
rectangle: area=a*b
 */
