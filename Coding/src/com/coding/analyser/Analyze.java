package com.coding.analyser;

import java.util.Set;

public class Analyze {

	public static void main(String[] args) {
		
		Reflections reflections = new Reflections("com.mycompany");    
		Set<Class<? extends MyInterface>> classes = reflections.getSubTypesOf(MyInterface.class);
		
	}
	
}
