package com.jaime.samples.designpatterns.creational.prototype.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class PropertyReader {

	private static String PROPERTIES_FILE = "/pizza.properties";
	private static String EQUALS_STRING = "=";


	public String getPropertyValue(String property) {
		String propertyValue = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(PROPERTIES_FILE)));
		    String line;
		    while ((line = br.readLine()) != null) {
		    	if(isPropertyInLine(property, line)) {
		    		propertyValue = getPropertyValueInLine(line);
		    		break;
		    	}
		    }
		    br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + PROPERTIES_FILE);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception for file: " + PROPERTIES_FILE);
			e.printStackTrace();
		}
		return propertyValue;
	}
	

	private boolean isPropertyInLine(String property, String line) {
		return line.contains(property);
	}
	
	private String getPropertyValueInLine(String line) {
		int equalsIdx = line.indexOf(EQUALS_STRING);
		if (equalsIdx < 0) {
			return "";
		}
		return line.substring(equalsIdx + EQUALS_STRING.length(), line.length());
	}
}
