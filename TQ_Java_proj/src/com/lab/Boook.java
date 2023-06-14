package com.lab;

public class Boook {

	private int b_id;
	private String b_name;
	private double b_price;
	private String promo;

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public void setB_price(double b_price) {
		this.b_price = b_price;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public int getB_id() {
		return b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public double getB_price() {
		this.getPromo();
		if (promo.equals("30OFF")) {
			b_price = b_price - (b_price * 0.30);
		} else {
			b_price = b_price - 1;
		}
		return b_price;
	}

	public String getPromo() {
		return promo;
	}

}
