package com.oops;

public class AccessModifier01 {

	private int a = 20;
	
	double b = 45.45; // default access modifier >>no need to declare as default >>if declared, it will show error.
	
	protected char c = 'P';
	
	public String d = "JAVA";
	
	private int aMethod() {
		
		return a;
	}
	
	double bMethod() {
		
		return b;
	}
	
	protected char cMethod() {
		
		return c;
	}
	
	public String dMethod() {
		
		return d;
	}

	public static void main(String[] args) {
		
		AccessModifier01 am1 = new AccessModifier01();
		System.out.println("Variables:\n");
		System.out.println("private "+ am1.a);
		System.out.println("default "+ am1.b);
		System.out.println("protected "+ am1.c);
		System.out.println("public "+ am1.d);
		
		System.out.println("\n\nMethods:\n");
		System.out.println("private "+ am1.aMethod());
		System.out.println("default "+ am1.bMethod());
		System.out.println("protected "+ am1.cMethod());
		System.out.println("public "+ am1.dMethod());
		
	}

}
