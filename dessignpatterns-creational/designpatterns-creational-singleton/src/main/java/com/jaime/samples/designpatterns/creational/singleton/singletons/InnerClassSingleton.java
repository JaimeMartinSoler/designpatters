package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #5: InnerClassSingleton: multi-thread safe, efficient and simple, but reflection unsafe
 * 
 * PROS:
 *  - this solves the all previous problems and does not require synchronization:
 *    INSTANCE is created at class Singleton initialization and this process
 *    is 'auto-sync' in java
 *  - it is multi-thread safe
 *  - this singleton construction is widely standard and used
 * CONS:
 *  - the complexity is a little bit increased (not a big issue...)
 *  - it can still be broken with Reflection
 */
public class InnerClassSingleton {
    
    private InnerClassSingleton () {
    }
    
    private static class Singleton {
    	private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return Singleton.INSTANCE;
    }
    
	public String greeting() {
		return "InnerClassSingleton instance";
	}
}
