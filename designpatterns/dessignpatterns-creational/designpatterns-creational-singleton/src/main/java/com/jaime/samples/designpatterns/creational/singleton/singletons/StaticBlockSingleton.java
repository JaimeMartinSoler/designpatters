package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #1.1: StaticBlockSingleton: same as EagerSingleton, but allows exception handling for constructor
 * 
 * PROS:
 *  - this is the easiest way of creating a singleton
 *  - it is multi-thread safe
 * CONS:
 *  - the instance is created even if the client does not use it
 *    (this is partially solved by the LazySingleton)
 */
public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
    
    private StaticBlockSingleton () {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
    
    public String greeting() {
    	return "StaticBlockSingleton instance";
	}
}
