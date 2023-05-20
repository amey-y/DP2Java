package com.oopsProblems;

public class CarInfo {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setModelNo(45698);
		c1.setName("Ignis");
		c1.setSpeedlimit(80);
		
		if(c1.getSpeedlimit()<=80)
		{
		System.out.println(c1.getModelNo());
		System.out.println(c1.getName());
		System.out.println(c1.getSpeedlimit());
		}
		else {
			System.out.println("Speedlimit is more than 80");
		}
	}

}
