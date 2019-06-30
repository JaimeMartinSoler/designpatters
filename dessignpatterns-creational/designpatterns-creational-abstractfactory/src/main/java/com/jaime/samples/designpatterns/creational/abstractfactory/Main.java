package com.jaime.samples.designpatterns.creational.abstractfactory;

import com.jaime.samples.designpatterns.creational.abstractfactory.model.AbstractFactory;
import com.jaime.samples.designpatterns.creational.abstractfactory.model.FactoryProducer;
import com.jaime.samples.designpatterns.creational.abstractfactory.model.shape.Shape;
import com.jaime.samples.designpatterns.creational.abstractfactory.model.color.Color;

/*
 * ABSTRACT FACTORY PATTERN
 *   https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 *
 * Note that Factories provide empty/default objects, while
 * Builders provide filled/setted objects according to a propose.
 * 
 * Similar pros and cons than FACTORY PATTERN, but now abstracting all
 * the factories with a FactoryPorducer or SuperFactory
 */
public class Main {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Shape shapeRounded = shapeFactory.getShape("rounded");
		Shape shapeSimple = shapeFactory.getShape("simple");
		Shape shapeRectangle = shapeFactory.getShape("rectangle");
		Color colorHot = colorFactory.getColor("hot");
		Color colorGreen = colorFactory.getColor("green");
		Color colorSea = colorFactory.getColor("sea");

		System.out.println("ABSTRACT FACTORY PATTERN");
		System.out.println(shapeRounded.getFormulaArea());
		System.out.println(shapeSimple.getFormulaArea());
		System.out.println(shapeRectangle.getFormulaArea());
		System.out.println(colorHot.getHexCode());
		System.out.println(colorGreen.getHexCode());
		System.out.println(colorSea.getHexCode());
	}
	
}

/* output:
ABSTRACT FACTORY PATTERN
circle: area=PI*r^2
square: area=l^2
rectangle: area=a*b
red: FF0000
green: 00FF00
blue: 0000FF
 */
