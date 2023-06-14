package com.lab07june;

import java.util.Scanner;

public class UppercaseLetters {

	public static String firstLetterUpper(String s) {
		String[] str = s.split(" ");
		String newStr = "";
		for (int i = 0; i < str.length; i++) {
			char[] wordstr = str[i].toCharArray();
			if ((wordstr[0] >= 97) && (wordstr[0] <= 122)) {
				wordstr[0] = (char) (wordstr[0] - 32);
			}

			newStr = newStr + new String(wordstr) + " ";
		}
		return newStr;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();

		System.out.println(UppercaseLetters.firstLetterUpper(s));

	}

}
