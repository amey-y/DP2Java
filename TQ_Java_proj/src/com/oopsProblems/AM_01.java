package com.oopsProblems;
import com.oops.AccessModifier01;

public class AM_01 extends AccessModifier01 {

	public static void main(String[] args) {
				
		System.out.println("Variables:\n");
		AM_01 yz = new AM_01();
		System.out.println(yz.c);
//		System.out.println(yz.a); // Private Variable>> Accessible only n Same class.
//		System.out.println(yz.b); //Default Variable>> Accessible only in same class
//								// and another class but in same package.
		System.out.println(yz.d);
		
		System.out.println("\n\nMethods:\n");		
		System.out.println(yz.cMethod());
//		System.out.println(yz.aMethod()); // Private method>> Accessible only n Same class.
//		System.out.println(yz.bMethod()); //Default method>> Accessible only in same class
//								// and another class but in same package.
		System.out.println(yz.dMethod());
		
	}

}
