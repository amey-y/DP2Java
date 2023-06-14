package com.arraylist;

import java.util.*;

public class DisplayOdd {
//	Find out the odd position element from ArrayList using iterator.
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(14);
		al.add(87);
		al.add(6);
		al.add(17);
		al.add(95);
		al.add(65);
		al.add(21);

		ListIterator<Integer> ltr = al.listIterator();

		while (ltr.hasNext()) {
			ltr.next();
			System.out.println(ltr.next());
		}

		int count = 0;
		while (ltr.hasNext()) {

			if (count % 2 != 0) {
				System.out.println(ltr.next());
			} else
				ltr.next();
			count++;
		}

	}

}
