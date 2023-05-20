package com.labAssignments;
import java.util.Scanner;

public class A1_Problem1 {

	public static void main(String[] args) {
//	1) William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. 
//	Help him find the number, whose sum is divisible by  3 or 5 or 7.
//	Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number. 
//	Note : The input other than 4 digit positive number[includes negative and 0] is considered as invalid.
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum=0, digit;

		if(num/1000>0)
		{
			while(num>0)
			{
				digit = num % 10;
				sum += digit;
				num /= 10;
			}
			if(sum%3==0 || sum%5==0 || sum%7==0)
			{
				System.out.println("Lucky Number");
			}
			else {
				System.out.println("Sorry its not my lucky number");
			}
		}
		else {
			System.out.println(num +" is not a valid car number");
		}
	}
}
