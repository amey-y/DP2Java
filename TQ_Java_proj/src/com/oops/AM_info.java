package com.oops;

public class AM_info {

	public static void main(String[] args) {
		AccessModifier01 ab = new AccessModifier01();
		
		System.out.println("Variables:\n");
//		System.out.println(ab.a); // // Private Cannot be Accessed outside its class.
		System.out.println("default "+ ab.b);
		System.out.println("protected "+ ab.c);
		System.out.println(ab.d);
		
		System.out.println("\n\nMethods:\n");
//		System.out.println(ab.aMethod(); // // Private Cannot be Accessed outside its class.
		System.out.println("default "+ ab.bMethod());
		System.out.println("protected "+ ab.cMethod());
		System.out.println(ab.dMethod());
		
	}

}
