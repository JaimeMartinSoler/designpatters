package com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder;

import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.Lunch;

/*
 * ABSTRACT BUILDER:
 * https://sourcemaking.com/design_patterns/builder/java/2
 * 
 * This Builder solves the same paradigm of CRAFT BUILDER, plus:
 * - The 'client' need a more complex building process, such as
 *   build part of the object or manage it in different ways
 * - Instead of one method per diff. object to build, now we have
 *   one class (with many methods) pero diff. object to build
 *   
 * There is a thin line between allowing a more complex building process and
 * just using the original object with setters...
 * ...the abstract build could be not worth
 * 
 * The abstract Menu Builder could even be an interface
 */
public abstract class LunchBuilder {

	protected Lunch menu;

	
	public LunchBuilder() {
		menu = new Lunch();
	}
	
	
	public Lunch getLunch() {
		return menu;
	}
	
	public void build() {
		buildPizza();
		buildDrink();
	}

	public abstract void buildPizza();
	
	public abstract void buildDrink();
	
	
}
