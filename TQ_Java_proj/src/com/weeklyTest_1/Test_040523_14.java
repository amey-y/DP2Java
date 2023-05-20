package com.weeklyTest_1;

public class Test_040523_14 {

	public static void main(String[] args) {
//		14)WAP to print fibbo series upto 20 terms.
		int n1=0, n2=1, i, n3, count=20;
		
		System.out.print(n1 +" "+ n2);
		
		for(i=2; i<count; i++)
		{
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
