package com.oops;

class StatOL	{
	
	public static void Stat() {
		
		System.out.println("Default");
	}
	
	public static void Stat(int i) {
		Stat((float) i);
		System.out.println("int "+i);
	}
	
	public static void Stat(float i) {
		Stat((double) i);
		System.out.println("float "+i);
	}
	
	public static void Stat(double i) {
		Stat();
		System.out.println("double "+i);
	}
}

public class StaticOverload01 {

	public static void Stat(double i) {
		StatOL.Stat();
		System.out.println("double2 "+i);
	}
	public static void main(String[] args) {
		
//		StatOL.Stat();
//		StatOL.Stat(21.0f);
		StatOL.Stat(21);
//		StatOL.Stat(21.0);
		Stat(21.0);
		StaticOverload01.main(1);
	}

	public static void main(int i) {
		System.out.println("main 2");
	}
}
