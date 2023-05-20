package com.labAssignments;
import java.util.Scanner;

public class A1_Problem4 {

	public static void main(String[] args) {
//		5)Pinky’s mom provides Pinky  with a number  and a key digit. 
//		She wants Pinky to find out how many times that key digit appears in that number.  
//		Help Pinky to do that by writing a program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Enter the key digit ");
		int key = sc.nextInt();
		sc.close();
		int copy=num, digit, count=0;
		while(num>0)
		{
			digit = num%10;
			if(digit==key)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(key +" appears "+ count +" times in "+ copy);
	}
}
