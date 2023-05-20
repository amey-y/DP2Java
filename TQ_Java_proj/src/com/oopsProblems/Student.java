package com.oopsProblems;

public class Student {
	int id;
	String name;
	int maths, history, physics;
	double perc;
	
	public void accept_details(int sid, String n, int m, int h, int p) {
		
		id = sid;
		name = n;
		maths = m;
		history = h;
		physics = p;
		
	}
	
	public void percentage() {
		
		perc = ((maths + history + physics)/300)*100;
	}
	
	public void display() {
		
		System.out.println("Id: "+id +"\nName: "+name +"\nPercentage: "+ perc );
	}

}
