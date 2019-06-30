package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #2: LazySingleton: simple singleton, efficient, but multi-thread unsafe, reflection unsafe
 * 
 * PROS:
 *  - this on of the easiest ways of creating a singleton
 *  - this solves the EagerSingleton problem:
 *    instance is created only if the client uses it
 * CONS:
 *  - it is not multi-thread-safe, if many threads call getInstance()
 *    at the same time the first time (this is solved by the ThreadSafeSingleton)
 */
public class LazySingleton {
	
	private static LazySingleton instance;
    
    private LazySingleton () {
    } 

    public static LazySingleton getInstance() {
    	if (instance == null) {
    		instance = new LazySingleton();
    	}
        return instance;
    } 
    
	public String greeting() {
		return "LazySingleton instance";
	}
}

