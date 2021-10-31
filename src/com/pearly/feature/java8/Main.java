package com.pearly.feature.java8;


public class Main {
	public static void main(String[] args) {
		Calculator addCal = (int a, int b) -> a + b;

		/*
		Equivalent way
		Calculator addCal = Integer::sum;
		Here, instead of assign a value (data) to an instance, we assign a Function to an instance of Function
		 */

		System.out.print("Result " + addCal.calculate(3, 5));
	}
}
