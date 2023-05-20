package com.lab2;
//import java.util.Scanner;

public class LoanCalc {

	int term;
	double principal = 50000, rate = 9.8, rate2 = 8.7, finalamt;
	
	public void loan(int term)
	{
		this.term = term;
		this.finalamt = (this.principal * term * this.rate) / 100;
		
		System.out.println("Final amount = "+ finalamt);
	}
	
	public void loan(int term, double principal)
	{
		this.term = term;
		this.principal = principal;
		if(term<6)
		{
			this.finalamt = (principal * term * this.rate) / 100;
		}
		else
		{
			this.finalamt = (principal * term * this.rate2) / 100;
		}
		System.out.println("Final amount = "+ this.finalamt);
		
	}
	
	public static void main(String[] args) {
		
		LoanCalc lc = new LoanCalc();
		lc.loan(18);
		lc.loan(18, 50000);
	}

}
