package com.stringPractice;
import java.util.Scanner;

public class NumCharString {
	
	public static void main(String[] args) {
//		WAP to find out the number of characters from the string.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String st = sc.nextLine();
		sc.close();
//		by converting to character array and using array's '.length' method
//		white space is considered as a character
		char st_char[] = st.toCharArray();
		System.out.println(st_char.length);
		
//		by removing white space and using string's '.length()' method
		String new_st = st.replaceAll(" ", "");
		System.out.println(new_st.length());
	}
}
