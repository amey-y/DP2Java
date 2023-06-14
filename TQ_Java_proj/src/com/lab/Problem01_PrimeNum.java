package com.lab;

import java.util.Scanner;

public class Problem01_PrimeNum {

	public static void main(String[] args) {
//		89734 >> find all the prime nums from digits of this num.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int digit;

		while (num > 0) {
			digit = num % 10;
			boolean isprime = true;
			for (int i = 2; i < digit; i++) {
				if (digit % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime == true) {
				System.out.println(digit);
			}
			num = num / 10;
		}
	}
}
