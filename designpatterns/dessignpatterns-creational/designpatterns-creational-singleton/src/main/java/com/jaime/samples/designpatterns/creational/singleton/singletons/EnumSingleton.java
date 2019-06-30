package com.jaime.samples.designpatterns.creational.singleton.singletons;

/*
 * #6: EnumSingleton: the best singleton implementation, solves everything with the benefits of enums
 * 
 * PROS:
 *  - enums are created just once, and the instance is created only on first call
 *    (this solves the same problems than LazySingleton)
 *  - previous statement stands even for multi-threading
 *    (this solves same problems than ThreadSafeSingleton, ThreadSafeDoubleCheckSingleton)
 *  - it is 'auto-sync' access
 *  - it is multi-thread safe
 *  - it is reflection safe
 *  - as of today, this is the best singleton implementation in java
 * CONS:
 *  - still in process of adoption
 */
public enum EnumSingleton {
    
	INSTANCE;
	
	/*
	 * // constructor is implicit in enums, we can whether write it or not
	 * private EnumSingleton() {
	 * }
	 */

	/*
	 * // INSTANCE can be externally accessed, we don't need a getInstance() method
	 * public static EnumSingleton getInstance() {
	 * 	   return INSTANCE;
	 * }
	 */
	
	public String greeting() {
		return "EnumSingleton instance";
	}
}
