package com.labTest;
import java.util.Scanner;

public class BouncyNumCheck {

	public static void main(String[] args) {
//		WAP to check given no is increasing decreasing or bouncy no
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		boolean increase = false, decrease = false;
		
		while(num>0)
		{
			int digit = num%10;
			num = num / 10;
			int digit2 = num%10;
			num = num/10;
			if(digit>digit2)
			{
				increase = true;
			}
			else {
				increase = false;
				break;
			}
		}
		num=copy;
		while(num>0)
		{
			int digit = num%10;
			num = num / 10;
			int digit2 = num%10;
			num = num/10;
			if(digit<digit2)
			{
				decrease = true;
			}
			else {
				decrease = false;
				break;
			}
		}
		if(increase)
		{
			System.out.println("Increasing");
		}
		else if(decrease)
		{
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Bouncy");
		}
		
	}

}
