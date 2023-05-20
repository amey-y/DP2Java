package com.staticPractice;

public class StaticOverload {
	int a, b;
	double x, y;
	static void test()
	{
		System.out.println("default");
	}
	static void test(int a)
	{
		System.out.println();
	}
	static void test(int a, int b)
	{
		
	}
	static void test(double x, double y)
	{
		
	}
	
	public static void main(String[] args) {
		
		StaticOverload.test();
		StaticOverload.test(5,4);
		StaticOverload.test(5.2,4.4);
		StaticOverload.test(6);
		
	}

}
