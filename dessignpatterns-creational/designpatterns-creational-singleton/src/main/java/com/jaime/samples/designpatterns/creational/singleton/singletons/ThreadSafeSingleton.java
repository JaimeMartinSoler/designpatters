package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #3: ThreadSafeSingleton: multi-thread safe, but inefficient, reflection unsafe
 * 
 * PROS:
 *  - this solves the LazySingleton problem:
 *    a multi-thread call to getInstance() can no longer be a problem,
 *    because 'synchronized' guarantees no simultaneous calls to getInstance()
 * CONS:
 *  - a call to a synchronized method has impact on performance,
 *    (this is solved with ThreadSafeDoubleCheckSingleton)
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton () {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
    	if (instance == null) {
    		instance = new ThreadSafeSingleton();
    	}
        return instance;
    }
    
    public String greeting() {
    	return "ThreadSafeSingleton instance";
	}
}
