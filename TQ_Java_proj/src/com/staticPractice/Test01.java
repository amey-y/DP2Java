package com.staticPractice;

class Overload
{
	static int x=2;
	int y;
	void add(int a)
	{
		x=a+1;
	}
	void add(int a, int b)
	{
		add(a);
		x += a+2;
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		
	Overload l= new Overload();
	int a=0;
	l.add(6,7);
	System.out.println(l.x);
	}
}
