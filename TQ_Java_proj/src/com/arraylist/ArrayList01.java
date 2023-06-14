package com.arraylist;
import java.util.*;

public class ArrayList01 {
	
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("New Delhi");
		list.add(544541);
		list.add(54.51);
		list.add(-84.662);
		list.add(true);
		list.add(null);
		System.out.println(list);
		System.out.println("\n....................................\n");
		
		ArrayList<Integer>al = new ArrayList<>();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		
		al.add(43);
		al.add(87);
		al.add(12);
		al.add(9);
		System.out.println(al.size());
		System.out.println("\n....................................\n");
		al.add(2, 4);
		al.add(0, 46);
		al.set(1, 23);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(1));
		al.remove(0);
		al.remove((Integer)9);
		System.out.println(al);
		System.out.println("\n....................................\n");
		
		
	}

}
