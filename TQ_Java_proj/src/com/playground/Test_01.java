package com.playground;

class A {

	public Animal show() {
		System.out.println("from A");
		return null;
	}
}

class B extends A {

	public Dog show() {
		System.out.println("from B");
		return null;
	}

}

public class Test_01 {

	public static void main(String[] args) {
		A a = new B();
		a.show();

	}
}

class Animal {

}

class Dog extends Animal {

}
