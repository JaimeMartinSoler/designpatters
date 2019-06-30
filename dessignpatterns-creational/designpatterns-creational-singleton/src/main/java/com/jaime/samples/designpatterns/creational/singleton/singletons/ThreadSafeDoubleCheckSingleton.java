package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #4: ThreadSafeDoubleCheckSingleton: multi-thread safe, efficient, but reflection unsafe
 * 
 * PROS:
 *  - this solves the ThreadSafeSingleton problem:
 *    the impact in performance is no longer an issue,
 *    the method getInstance() is not synchronized, just a block inside it,
 *    accessed only the first time that the object is created
 * CONS:
 *  - the complexity is a bit increased (not a big issue...)
 */
public class ThreadSafeDoubleCheckSingleton {
	
	private static ThreadSafeDoubleCheckSingleton instance;
    
    private ThreadSafeDoubleCheckSingleton () {
    }

    public static ThreadSafeDoubleCheckSingleton getInstance() {
    	if (instance == null) {
    		synchronized (ThreadSafeDoubleCheckSingleton.class) {
    	    	if (instance == null) {
    	    		instance = new ThreadSafeDoubleCheckSingleton();
    	    	}
    		}
    	}
        return instance;
    }
    
    public String greeting() {
    	return "ThreadSafeDoubleCheckSingleton instance";
	}
}

