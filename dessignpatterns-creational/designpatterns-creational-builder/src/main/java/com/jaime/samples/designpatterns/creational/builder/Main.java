package com.jaime.samples.designpatterns.creational.builder;

import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder.LunchChickenBuilder;
import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.builder.LunchVegetarianBuilder;
import com.jaime.samples.designpatterns.creational.builder.abstractbuilder.model.Lunch;
import com.jaime.samples.designpatterns.creational.builder.craftbuilder.builder.MenuBuilder;
import com.jaime.samples.designpatterns.creational.builder.craftbuilder.model.Menu;
import com.jaime.samples.designpatterns.creational.builder.optionalparamsbuilder.Computer;

/*
 * BUILDER PATTERN
 *   https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 *   https://sourcemaking.com/design_patterns/builder/java/2
 *   
 * Note that Factories provide empty/default objects, while
 * Builders provide filled/setted objects according to a propose.
 *   
 * There are many different approaches of the Builder Patter,
 * here I gathered the most relevant, (be aware: interpreted and name by myself)
 * - Craft Builder: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
 * - Abstract Builder: https://sourcemaking.com/design_patterns/builder/java/2
 * - Optional Parameters Builder: http://www.journaldev.com/1425/builder-design-pattern-in-java
 */
public class Main {

	public static void main(String[] args) {

		// Craft Builder
		Menu menuVegetarian = MenuBuilder.buildMenuVegetarian();
		Menu menuChicken = MenuBuilder.buildMenuChicken();
		Menu menuChickenMaxiBeer = MenuBuilder.buildMenuChickenMaxiBeer();
		
		// Abstract Builder
		//		vegetarian
		LunchVegetarianBuilder lunchVegetarianBuilder = new LunchVegetarianBuilder();
		lunchVegetarianBuilder.build();
		Lunch lunchVegetarian = lunchVegetarianBuilder.getLunch();
		//		chicken
		LunchChickenBuilder lunchChickenBuilder = new LunchChickenBuilder();
		lunchChickenBuilder.buildPizza();
		Lunch lunchChickenNoDrink = lunchChickenBuilder.getLunch();
		//		chicken beer maxi
		LunchChickenBuilder lunchChickenBuilder2 = new LunchChickenBuilder();
		lunchChickenBuilder2.buildPizza();
		lunchChickenBuilder2.buildDrinkMaxiBeer();
		Lunch lunchChickenMaxiBeer = lunchChickenBuilder2.getLunch();
		
		// Optional Parameters Builder
		Computer computer1 = new Computer.ComputerBuilder(
				"500 GB", "2 GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		Computer computer2 = new Computer.ComputerBuilder(
				"1 TB", "4 GB")
				.setGraphicsCardEnabled(true)
				.build();
		
		// print craft builder
		System.out.println("BUILDER PATTERN");
		System.out.println("\nCRAFT BUILDER");
		System.out.println(menuVegetarian.toString());
		System.out.println(menuChicken.toString());
		System.out.println(menuChickenMaxiBeer.toString());
		// print abstract builder
		System.out.println("\nABSTRACT BUILDER");
		System.out.println(lunchVegetarian.toString());
		System.out.println(lunchChickenNoDrink.toString());
		System.out.println(lunchChickenMaxiBeer.toString());
		// print optional parameters builder
		System.out.println("\nOPTIONAL PARAMETERS BUILDER");
		System.out.println("Computer 1:");
		System.out.println(computer1.toString());
		System.out.println("Computer 2:");
		System.out.println(computer2.toString());
	}
}

/* output:
BUILDER PATTERN

CRAFT BUILDER
Menu Vegetarian ($4.7):
    Pizza Vegetarian ($3.5) [Tomato, Cheese, Onion]
    Water ($1.2)
Menu Chicken ($5.5):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
    Beer ($1.5)
Menu Chicken Maxi Beer ($9.0):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
    Beer ($5.0)

ABSTRACT BUILDER
Lunch Vegetarian ($4.7):
    Pizza Vegetarian ($3.5) [Tomato, Cheese, Onion]
    Water ($1.2)
Lunch Chicken ($4.0):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
Lunch Chicken ($9.0):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
    Beer ($5.0)

OPTIONAL PARAMETERS BUILDER
Computer 1:
    HDD: 500 GB
    RAM: 2 GB
    Graphics Card Enabled: true
    Bluetooth Enabled: true
Computer 2:
    HDD: 1 TB
    RAM: 4 GB
    Graphics Card Enabled: true
    Bluetooth Enabled: false
*/

