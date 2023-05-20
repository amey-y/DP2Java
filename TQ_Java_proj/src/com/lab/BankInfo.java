package com.lab;

public class BankInfo {

	public static void main(String[] args) {
		Bank bk = new Bank();
		
		System.out.println(bk.getBankName("PNB"));
		System.out.println(bk.getRoI(8.40f));
//		System.out.println(bk.getLockerId(9823)); // Private Cannot be Accessed.
		System.out.println(bk.getBranch("SuperStar Branch"));
		
		
		
		
	}

}
