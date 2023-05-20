package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_04_VowelConsonent {

	public static void main(String[] args) {

//		4. Write a Java program to input any alphabet and check whether it is vowel or consonant
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Alphabet: ");
		char alphabet = sc.next().charAt(0);
		sc.close();
		
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||
				alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
		{
			System.out.println("Entered alphabet is Vowel.");
		}
		else if(alphabet>='a' && alphabet<='z'||alphabet>='A' && alphabet<='Z')
		{
			System.out.println("Entered alphabet is Consonent.");
		}
		else
			System.out.println("Invalid character!");
		
	}

}
