package com.project.main;

import com.project.test.AnotherSimpleClass;
import com.project.test.SimpleClass;
import com.project.test.UltraClass;

public class MainClass {

	public static int calculate(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Message from gitHub folder: " + SimpleClass.getMessage());
		System.out.println("Another line");
		System.out.println("Method :" + calculate(5, 6));
		System.out.println("Class method 1: " + SimpleClass.calculate(5, 6));
		System.out.println("Class method 2: " + AnotherSimpleClass.calculate(5, 6));
		System.out.println("Class method 3: " + UltraClass.calculate(5, 6));
		//no data
		
		
		System.out.println("Class method 4: " + "No data");
	}
	
}
