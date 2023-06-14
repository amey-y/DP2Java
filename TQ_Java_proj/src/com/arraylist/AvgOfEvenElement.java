package com.arraylist;

import java.util.ArrayList;

public class AvgOfEvenElement {
//	WAP to find out the average of even element from the Array element from the Array list.
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		int[] arr = { 45, 15, 64, 7, 9, 8, 2, 6, 23, 78, 94, 63, 14, 33 };

		for (int a : arr) {
			al.add(a);
		}

		int sum = 0, count = 0;

		for (int a : al) {
			if (a % 2 == 0) {
				sum += a;
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Average of even elements: " + (sum / count));
		} else {
			System.out.println("There are no even elements present");
		}

	}

}
