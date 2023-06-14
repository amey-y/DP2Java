package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNum {
//	WAP to display Prime numbers from the ArrayList.
	Scanner sc = new Scanner(System.in);

	public ArrayList<Integer> createArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int count = 0;
		System.out.println("Enter a few numbers: ");

		do {
			int num = sc.nextInt();
			al.add(num);
			count++;

		} while (count < 10);

		System.out.println(al);
		return al;
	}

	public boolean findPrimeNum(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public void displayPrime() {
		ArrayList<Integer> al = createArrayList();
		System.out.println("Prime number(s) from given ArrayList is/are: ");
		for (Integer a : al) {
			if (findPrimeNum(a)) {
				System.out.print(a + " ");
			}
		}

	}

	public static void main(String[] args) {

		PrimeNum pn = new PrimeNum();
		pn.displayPrime();

	}

}
