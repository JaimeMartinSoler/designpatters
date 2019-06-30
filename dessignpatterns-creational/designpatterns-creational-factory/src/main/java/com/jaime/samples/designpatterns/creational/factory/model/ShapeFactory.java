package com.jaime.samples.designpatterns.creational.factory.model;

/*
 * There are usual ways of implementing a factory, and all can live together,
 * although usually just one is chosen:
 * - getter(String)
 * - getter(Class)
 * - create() methods, one per child class
 * With static methods we don't need to create a ShapeFactory object
 */
public class ShapeFactory {

	/*
	 * GETTER(String)
	 * Pros: no need to know nothing about child classes
	 * Cons: it hides too much the child classes, we don't know what we are using
	 */
	public static Shape getShape(String description) {
		switch(description.toLowerCase()) {
		case "circle":
		case "round":
		case "rounded":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
		case "simple":
			return new Square();
		default:
			return null;
		}
	}
	
	
	/*
	 * GETTER(Class)
	 * Pros: just the necessary knowledge of child classes and clean
	 * Cons: needs to import and use the child classes
	 */
	public static Shape getShape(@SuppressWarnings("rawtypes") Class cls) {
		if (cls.equals(Circle.class)) {
			return new Circle();
		} else if (cls.equals(Rectangle.class)) {
			return new Rectangle();
		} else if (cls.equals(Square.class)) {
			return new Square();
		} else {
			return null;
		}
	}


	/*
	 * CREATE() METHODS
	 * Pros: doesn't mess with parameters, relatively clean
	 * Cons: one function per child class
	 */
	public static Shape createCircle() {
		return new Circle();
	}
	
	public static Shape createRectangle() {
		return new Rectangle();
	}
	
	public static Shape createSquare() {
		return new Square();
	}
	
}
