package com.oops;

public class ThisKeywordUses {

	char a;
	double b;
	
	public ThisKeywordUses(char a) {
		this();
		this.a = a;
	}
	
	public ThisKeywordUses() {
		System.out.println("2nd Constructor");
	}
	
	public void show() {
		this.b = multiply(45);
		System.out.println(a);
		System.out.println(b);
	}
	
	public double multiply(double b) {
		return b * b * 0.67;
	}
	
	public static void main(String[] args) {
		
		ThisKeywordUses tk = new ThisKeywordUses('x');
		tk.show();
	}
}
