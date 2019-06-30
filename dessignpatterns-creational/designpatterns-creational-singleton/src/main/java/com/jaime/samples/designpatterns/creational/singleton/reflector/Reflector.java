package com.jaime.samples.designpatterns.creational.singleton.reflector;

import java.lang.reflect.Constructor;
import com.jaime.samples.designpatterns.creational.singleton.singletons.EagerSingleton;

/*
 * This is not a singleton pattern,
 * it shows how to destroy many singleton patterns with class reflection
 * (dynamic modification of class properties)
 * 
 * Although is destroys even the InnerClassSingleton,
 * it really has to be done on propose, so it is OK to implement it
 */
public class Reflector {
	
	public static void reflectEagerSingleton() {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo = null;
        try {
            Constructor<?>[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nReflection of EagerSingleton (breaking the singleton):");
        System.out.println("    " + instanceOne.greeting() + " One " + instanceOne.hashCode());
        System.out.println("    " + instanceTwo.greeting() + " Two " + instanceTwo.hashCode());
    }
	
}
