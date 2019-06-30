package com.jaime.samples.designpatterns.creational.prototype;

import com.jaime.samples.designpatterns.creational.prototype.model.Drink;
import com.jaime.samples.designpatterns.creational.prototype.model.Menu;
import com.jaime.samples.designpatterns.creational.prototype.prototype.MenuPrototype;

/*
 * PROTOTYPE PATTERN
 *   https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm
 *   
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * Instead of creating an object from the source every time (like the Builder),
 * we first create a local CACHE and we get those prototypes every time.
 * 
 * This is easier to understand with this example, in which the objects are created from a file,
 * which has to be read. Instead of reading it for every object creation, the Prototype holds
 * a cache copy (loaded from the file just the first time), and delivers cloned copies.
 */
public class Main {

	public static void main(String[] args) {

		// do the heavy process, but just once (read parameters from file)
		MenuPrototype.loadPrototypes();
		
		Menu menuVegetarian = MenuPrototype.getMenu(MenuPrototype.KEY_MENU_VEGETARIAN);
		// next time we getMenu(...), it is not loaded from file, just from the Prototype cache
		Menu menuVegetarian2 = MenuPrototype.getMenu(MenuPrototype.KEY_MENU_VEGETARIAN);
		menuVegetarian2.getDrink().setName(Drink.COKE);
		menuVegetarian2.getDrink().setPrice(1.5f);
		Menu menuChicken = MenuPrototype.getMenu(MenuPrototype.KEY_MENU_CHICKEN);
		Menu menuChickenMaxiBeer = MenuPrototype.getMenu(MenuPrototype.KEY_MENU_CHICKEN_MAXI_BEER);
		
		System.out.println("PROTOTYPE PATTERN");
		System.out.println(menuVegetarian.toString());
		System.out.println(menuVegetarian2.toString());
		System.out.println(menuChicken.toString());
		System.out.println(menuChickenMaxiBeer.toString());
	}
}

/* output:
PROTOTYPE PATTERN
Menu Vegetarian ($5.0):
    Pizza Vegetarian ($3.5) [Tomato, Cheese, Onion]
    Coke ($1.5)
Menu Vegetarian ($5.0):
    Pizza Vegetarian ($3.5) [Tomato, Cheese, Onion]
    Coke ($1.5)
Menu Chicken ($5.5):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
    Beer ($1.5)
Menu Chicken Maxi Beer ($9.0):
    Pizza Chicken ($4.0) [Tomato, Cheese, Onion, Chicken]
    Beer ($5.0)
*/

