package com.labAssignments;
import java.util.Scanner;

public class A1_Problem2 {

	public static void main(String[] args) {
//		Each birthday, Meenu’s parents gift her gold coins. On her 1st birthday she got one coin from them, 
//		2nd birthday 8 coins,3rd birthday 27 coins, 4th birthday 64 coins, 5th birthday 125 coins and so on. 
//		Meenu is now 10 years old. Given her age, help her calculate how many coins she can get for that birthday.
//		Note : Age should be a valid positive number(>0). In case of any invalid input, the output should be "Invalid Age".
//		1,8,27,64,125.....n
		Scanner sc=new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		int coins;
		
		if(age>0)
		{
			coins = 0;
			for(int i=1; i<=age; i++)
			{
				coins = i*i*i;
			}
			System.out.println("Mennu gets "+ coins +" coins");
		}
		else {
			System.out.println("Invalid Age");
		}
	}
}
