package com.jaime.samples.designpatterns.creational.singleton;

import com.jaime.samples.designpatterns.creational.singleton.reflector.Reflector;
import com.jaime.samples.designpatterns.creational.singleton.singletons.EagerSingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.StaticBlockSingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.LazySingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.ThreadSafeSingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.ThreadSafeDoubleCheckSingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.InnerClassSingleton;
import com.jaime.samples.designpatterns.creational.singleton.singletons.EnumSingleton;

/*
 * SINGLETON PATTERN
 *   https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
 *   http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
 *   
 * It lets us create an object an efficiently guarantee that
 * it is possible to create one only instance of it, with:
 * - private constructor to restrict instantiation from other classes
 * - private static variable of the same class that is the only instance of the class
 * - public static method that returns the instance of the class
 * 
 * Summary of implementations:
 * #1: EagerSingleton: the simplest singleton but inefficient, multi-thread unsafe, reflection unsafe
 * #1.1: StaticBlockSingleton: same as EagerSingleton, but allows exception handling for constructor
 * #2: LazySingleton: simple singleton, efficient, but multi-thread unsafe, reflection unsafe
 * #3: ThreadSafeSingleton: multi-thread safe, but inefficient, reflection unsafe
 * #4: ThreadSafeDoubleCheckSingleton: multi-thread safe, efficient, but reflection unsafe
 * #5: InnerClassSingleton: multi-thread safe, efficient and simple, but reflection unsafe
 * #6: EnumSingleton: the best singleton implementation, solves everything with the benefits of enums
 *
 * Conclusion:
 * both InnerClassSingleton and EnumSingleton are widely valid and used,
 * however the EnumSingleton reflection safe property and its lack of
 * constructor, getInstance() method and need of creation (just call it and use it)
 * makes it the best choice and where the programmers are facing to, so:
 * use EnumSingleton
 *
 */
public class Main {

	public static void main(String[] args) {

		EagerSingleton eagerSingletonOne = EagerSingleton.getInstance();
		EagerSingleton eagerSingletonTwo = EagerSingleton.getInstance();
		StaticBlockSingleton staticBlockSingletonOne = StaticBlockSingleton.getInstance();
		StaticBlockSingleton staticBlockSingletonTwo = StaticBlockSingleton.getInstance();
		LazySingleton lazySingletonOne = LazySingleton.getInstance();
		LazySingleton lazySingletonTwo = LazySingleton.getInstance();
		ThreadSafeSingleton threadSafeSingletonOne = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton threadSafeSingletonTwo = ThreadSafeSingleton.getInstance();
		ThreadSafeDoubleCheckSingleton threadSafeDoubleCheckSingletonOne = ThreadSafeDoubleCheckSingleton.getInstance();
		ThreadSafeDoubleCheckSingleton threadSafeDoubleCheckSingletonTwo = ThreadSafeDoubleCheckSingleton.getInstance();		
		InnerClassSingleton innerClassSingletonOne = InnerClassSingleton.getInstance();
		InnerClassSingleton innerClassSingletonTwo = InnerClassSingleton.getInstance();
		EnumSingleton enumSingletonOne = EnumSingleton.INSTANCE;

		System.out.println("SINGLETON PATTERN");
        System.out.println(eagerSingletonOne.greeting() + " One " + eagerSingletonOne.hashCode());
        System.out.println(eagerSingletonTwo.greeting() + " Two " + eagerSingletonTwo.hashCode());
        System.out.println(staticBlockSingletonOne.greeting() + " One " + staticBlockSingletonOne.hashCode());
        System.out.println(staticBlockSingletonTwo.greeting() + " Two " + staticBlockSingletonTwo.hashCode());
        System.out.println(lazySingletonOne.greeting() + " One " + lazySingletonOne.hashCode());
        System.out.println(lazySingletonTwo.greeting() + " Two " + lazySingletonTwo.hashCode());
        System.out.println(threadSafeSingletonOne.greeting() + " One " + threadSafeSingletonOne.hashCode());
        System.out.println(threadSafeSingletonTwo.greeting() + " Two " + threadSafeSingletonTwo.hashCode());
        System.out.println(threadSafeDoubleCheckSingletonOne.greeting() + " One " + threadSafeDoubleCheckSingletonOne.hashCode());
        System.out.println(threadSafeDoubleCheckSingletonTwo.greeting() + " Two " + threadSafeDoubleCheckSingletonTwo.hashCode());
        System.out.println(innerClassSingletonOne.greeting() + " One " + innerClassSingletonOne.hashCode());
        System.out.println(innerClassSingletonTwo.greeting() + " Two " + innerClassSingletonTwo.hashCode());
        System.out.println(enumSingletonOne.greeting() + " One " + enumSingletonOne.hashCode());
		// EnumSingleton does not need to be created actually, just use it with EnumSingleton.INSTANCE
        System.out.println(EnumSingleton.INSTANCE.greeting() + " OK  " + EnumSingleton.INSTANCE.hashCode());
		
		Reflector.reflectEagerSingleton();
	}
	
}

/* output:
SINGLETON PATTERN
EagerSingleton instance One 366712642
EagerSingleton instance Two 366712642
StaticBlockSingleton instance One 1829164700
StaticBlockSingleton instance Two 1829164700
LazySingleton instance One 2018699554
LazySingleton instance Two 2018699554
ThreadSafeSingleton instance One 1311053135
ThreadSafeSingleton instance Two 1311053135
ThreadSafeDoubleCheckSingleton instance One 118352462
ThreadSafeDoubleCheckSingleton instance Two 118352462
InnerClassSingleton instance One 1550089733
InnerClassSingleton instance Two 1550089733
EnumSingleton instance One 865113938
EnumSingleton instance OK  865113938

Reflection of EagerSingleton (breaking the singleton):
    EagerSingleton instance One 366712642
    EagerSingleton instance Two 1442407170
 */

