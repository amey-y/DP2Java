package com.lab12june23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListRemoveDuplicates {

	public void display(ArrayList<String> al) {
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

	public void removeDuplicates(ArrayList<String> al) {
//		Iterator<String> itr = al.iterator();
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
				}
			}
		}
		display(al);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Enter 6 colors: ");

		for (int i = 0; i <= 6; i++) {
			al.add(sc.next());
		}

		ArrayListRemoveDuplicates rd = new ArrayListRemoveDuplicates();
		rd.display(al);
		rd.removeDuplicates(al);

	}

}
