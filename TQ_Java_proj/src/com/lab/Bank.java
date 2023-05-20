package com.lab;

public class Bank {
	public String bank_name;
	protected float rateOfInterest;
	private int locker_id;
	String branch_name;
	
	public String getBankName(String bank_name) {
		return bank_name;
	}
	
	protected float getRoI(float rateOfInterest) {
		return rateOfInterest;
	}
	
	private int getLockerId(int locker_id) {
		return locker_id;
	}
	
	String getBranch(String branch_name) {
		return branch_name;
	}
	
	public static void main(String[] args) {
		Bank b = new Bank();
		
		System.out.println(b.getBankName("Laxmi Chit Fund Bank"));
		System.out.println(b.getRoI(4.20f));
		System.out.println(b.getLockerId(9211));
		System.out.println(b.getBranch("Star Branch"));
	}
}
