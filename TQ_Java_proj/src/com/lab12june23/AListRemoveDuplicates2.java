package com.lab12june23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AListRemoveDuplicates2 {
	Scanner sc = new Scanner(System.in);

	public void display(ArrayList<String> al1) {
		Iterator<String> itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

	public void removeDuplicates(ArrayList<String> al1, ArrayList<String> al2) {

		for (int i = 0; i < al1.size(); i++) {

			for (int j = i + 1; j < al1.size(); j++) {

				if (al1.get(i).equals(al1.get(j))) {
					al1.remove(j);
					al1.remove(i);
				}
			}
			for (int k = 0; k < al2.size(); k++) {
				if (al1.get(i).equals(al2.get(k))) {
					al2.remove(k);
					al1.remove(i);
				}
			}
		}

		display(al1);
		display(al2);

	}

	public ArrayList<String> buildArrayList() {
		ArrayList<String> al = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			al.add(sc.next());
		}
		return al;
	}

	public static void main(String[] args) {
		AListRemoveDuplicates2 rd = new AListRemoveDuplicates2();

		ArrayList<String> al1 = new ArrayList<>();
		System.out.println("ArrayList 1 >> Enter 4 colors: ");
		al1 = rd.buildArrayList();

		ArrayList<String> al2 = new ArrayList<>();
		System.out.println("ArrayList 2 >> Enter 4 colors: ");
		al2 = rd.buildArrayList();

		System.out.println("Original ArrayLists: ");
		rd.display(al1);
		rd.display(al2);
		System.out.println("\nRemoving Duplicates: ");
		rd.removeDuplicates(al1, al2);

	}

}
