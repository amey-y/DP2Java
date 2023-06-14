package com.arraylist;

import java.util.*;

public class ArrayList02 {

	public static void main(String[] args) {
		
		ArrayList<String>al = new ArrayList<>();
		al.add(null);
		al.add("Rohit");
		al.add("Kohli");
		al.add("Jadeja");
		al.add("Pant");
		al.add(null);
		al.add("Bumrah");
		al.add("Gill");
		System.out.println(al);
		System.out.println("\n..............Using For Loop......................\n");
		for(int i = 0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("\n........using for each loop............................\n");
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("\n............using Iterator........................\n");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n.................Using List Iterator...................\n");
		ListIterator<String>litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("\n....................................\n");
		while(litr.hasNext())
		{
			litr.next();
		}
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("\n....................................\n");
		
		ListIterator<String> litr2 = al.listIterator(al.size());
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
		}
		System.out.println("\n....................................\n");
		
	}

}
