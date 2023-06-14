package com.stringPractice;
import java.util.Scanner;
public class NumWordsString {

	public void tester(String st)
	{
		String []words_st = st.split(" ");
		System.out.println(words_st.length);
	}
	
	public static void main(String[] args) {
//		WAP to find out the number of words from the string.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st = sc.nextLine();
		sc.close();
		
//		String []words_st = st.split(" ");
//		System.out.println(words_st.length);
		NumWordsString nw = new NumWordsString();
		nw.tester(st);
		
	}

}
