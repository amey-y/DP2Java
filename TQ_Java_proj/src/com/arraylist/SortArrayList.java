package com.arraylist;

import java.util.ArrayList;

public class SortArrayList {
//	WAP to sort ArrayList w/o using sort method & w/o converting it to Array.F
	public ArrayList<Integer> sortArrayList(ArrayList<Integer> al) {

		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {

				Integer temp1 = al.get(i);
				Integer temp2 = al.get(j);

				if (temp1 > temp2) {
					al.set(i, temp2);
					al.set(j, temp1);

				}
			}
		}
		return al;
	}

	public static void main(String[] args) {
		int[] arr = { 45, 15, 64, 7, 9, 8, 2, 6, 23, 78, 94, 63, 14, 33 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}

		System.out.println(al);
		SortArrayList sal = new SortArrayList();

		System.out.println(sal.sortArrayList(al));

	}

}
