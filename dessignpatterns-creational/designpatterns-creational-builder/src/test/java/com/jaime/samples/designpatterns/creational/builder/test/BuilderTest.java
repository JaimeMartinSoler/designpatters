package com.jaime.samples.designpatterns.creational.builder.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jaime.samples.designpatterns.creational.builder.Main;

class BuilderTest {

	@BeforeAll
	static void setupAll() {
		final StringBuilder sb = new StringBuilder()
				.append("\n\n")
				.append("--------------------------------------------------------------------------------\n")
				.append("--------------------------------------------------------------------------------\n")
				.append("STARTING JUNIT TEST: BUILDER PATTERN\n");
		System.out.println(sb.toString());
	}

	@Test
	void testMain() {
		Main.main(new String[0]);
		Assertions.assertTrue(true);
	}

}
