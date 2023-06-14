package com.stringPractice;

import java.util.Scanner;

public class String3Digit {
	/*
	 * Take one string from user, first check string contain only digits, if yes
	 * then perform the addition of first 3 digits & last 3 digits. If both are same
	 * then display "It is valid" otherwise display "Invalid".
	 */
	class InvalidStringException extends RuntimeException {
		public InvalidStringException() {
			super();
		}

		public InvalidStringException(String message) {
			super(message);
		}
	}

	public boolean isDigits(String str) {
		try {
			if (str.length() < 3) {
//			System.out.println("There must be at least 3 digits");
//			System.exit(0);
				throw new InvalidStringException();
			}
		} catch (InvalidStringException e) {
			System.out.println("There must be at least 3 digits");
		}
		boolean isDigit = true;
		try {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) < '0' || str.charAt(i) > '9') {
					isDigit = false;
//				break;
					throw new InvalidStringException();
				}
			}
		} catch (InvalidStringException e) {
			System.out.println("String contains characters other than numbers");
		}
		return isDigit;
	}

	public void calc(String str) {
		if (this.isDigits(str)) {
//			char[] st = str.toCharArray();
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < 3; i++) {
//				sum1 += Character.getNumericValue(st[i]);
				sum1 += Character.getNumericValue(str.charAt(i));
			}
//			for(int j=st.length-1; j>st.length-4; j--)
			for (int j = str.length() - 1; j > str.length() - 4; j--) {
//				sum2 += Character.getNumericValue(st[j]);
				sum2 += Character.getNumericValue(str.charAt(j));
			}
			if (sum1 == sum2) {
				System.out.println(sum1 + " = " + sum2 + "\t >> It is Valid!");
			} else {
				System.out.println(sum1 + " != " + sum2 + "\t >> Invalid!");
			}
		}
//		else
//			System.out.println("String contains characters other than numbers!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number only string containing min 3 digits: ");
		String str = sc.nextLine().replaceAll(" ", "");
		sc.close();

		String3Digit sd = new String3Digit();
		sd.calc(str);
	}
}
