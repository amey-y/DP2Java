package com.basic;

public class PercentageCalc {

	public static void main(String[] args) {
		
//		Write a code to calculate Percentage for 5 subjects.
		double maths, physics, chemistry, history, geography, total;
		maths = 85;
		physics = 88;
		chemistry = 83;		
		history = 81;
		geography = 92;
			
		total = maths + physics + chemistry + history + geography;
		double p = (total / 500)* 100;
		
		System.out.println(p);
		
		
	}

}
