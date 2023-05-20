package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_07_AlphaDigiSpcChar {

	public static void main(String[] args) {
//		2. Write a Java program to input any character and check whether it is alphabet, digit or special character
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		{
			System.out.println(ch +" is a Alphabet!");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println(ch +" is a Number!");
		}
		else
			System.out.println(ch +" is a Special Character");
			
	}

}
