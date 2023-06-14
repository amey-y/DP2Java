package com.lab07june;

import java.util.Arrays;

public class ColorSorter {

	public static String sortColor(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		String[] arr = { "purple", "red", "yellow", "green", "blue", "white", "orange" };

		System.out.println(sortColor(arr));

	}

}
