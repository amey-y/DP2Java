package com.lab;

public class Movie {

	int id;
	String name;
	double price;

	public Movie(int mid, String mname, double tprice) {
		id = mid;
		name = mname;
		price = tprice;
	}

	public double getPrice(double disc) {
		if (disc == 100) {
			price = price - (price * 0.15);
		} else if (disc == 200) {
			price = price - (price * 0.1);
		} else {
			price = price - 0;
		}
		return price;
	}
}
