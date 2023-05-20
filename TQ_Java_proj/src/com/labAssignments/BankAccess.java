package com.labAssignments;
import com.lab.Bank;
public class BankAccess extends Bank {

	public static void main(String[] args) {
		
		BankAccess ba = new BankAccess();
		System.out.println(ba.getBankName("SBI"));
		System.out.println(ba.getRoI(7.50f));
//		System.out.println(ba.getLockerId(4586); // Private Variable>> Accessible only n Same class.
		
//		System.out.println(ba.getBranch("Delhi"); // Default Variable>> Accessible only in same class
//											// and another class but in same package.
		
	}

}
