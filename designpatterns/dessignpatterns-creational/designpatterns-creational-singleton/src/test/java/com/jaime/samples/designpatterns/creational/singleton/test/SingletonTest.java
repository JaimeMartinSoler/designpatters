package com.jaime.samples.designpatterns.creational.singleton.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jaime.samples.designpatterns.creational.singleton.Main;

class SingletonTest {

	@BeforeAll
	static void setupAll() {
		final StringBuilder sb = new StringBuilder()
				.append("\n\n")
				.append("--------------------------------------------------------------------------------\n")
				.append("--------------------------------------------------------------------------------\n")
				.append("STARTING JUNIT TEST: SINGLETON PATTERN\n");
		System.out.println(sb.toString());
	}

	@Test
	void testMain() {
		Main.main(new String[0]);
		Assertions.assertTrue(true);
	}

}
