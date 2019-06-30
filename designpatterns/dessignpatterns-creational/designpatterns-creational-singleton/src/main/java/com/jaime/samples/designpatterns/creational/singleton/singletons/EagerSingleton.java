package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #1: EagerSingleton: the simplest singleton but inefficient, multi-thread unsafe, reflection unsafe
 * 
 * PROS:
 *  - this is the easiest way of creating a singleton
 *  - it is multi-thread safe
 * CONS:
 *  - the instance is created even if the client does not use it
 *    (this is partially solved by the LazySingleton)
 *    (StaticBlockSingleton adds a variation to allow exception handling for constructor)
 */
public class EagerSingleton {
	
	private static final EagerSingleton INSTANCE = new EagerSingleton();
    
    private EagerSingleton () {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
    
	public String greeting() {
		return "EagerSingleton instance";
	}
}
