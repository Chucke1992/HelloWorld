package com.project.main;

import com.project.test.SimpleClass;

public class MainClass {

	public static int calculate(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Message from gitHub folder: " + SimpleClass.getMessage());
		System.out.println("Another line");
		System.out.println("Method :" + calculate(5, 6));
		System.out.println("Class method: " + SimpleClass.calculate(5, 6));
	}
	
}
