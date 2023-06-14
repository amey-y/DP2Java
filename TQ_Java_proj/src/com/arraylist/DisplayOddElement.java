package com.arraylist;

import java.util.*;

public class DisplayOddElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		int[] arr = { 45, 15, 64, 7, 9, 8, 2, 6, 23, 78, 94, 63, 14, 33 };

		for (int a : arr) {
			al.add(a);
		}

		for (int a : al) {
			if (a % 2 != 0) {
				System.out.println(a);
			}
		}

	}

}
