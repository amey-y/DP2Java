package com.labAssignments2;

import java.util.Scanner;

public class TheatreInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Theatre t[] = new Theatre[2];

		for (int i = 0; i < t.length; i++) {

			System.out.println("Enter theatre id");
			int t_id = sc.nextInt();
			System.out.println("Enter theatre name");
			String t_name = sc.next();

			t[i] = new Theatre();
			Movie m = new Movie();

			t[i].setT_id(t_id);
			t[i].setT_name(t_name);

			Movie[] mv = new Movie[2];
			t[i].setM(mv);
			for (int j = 0; j < mv.length; j++) {
				System.out.println("Enter movie id");
				int m_id = sc.nextInt();
				System.out.println("Enter Movie name");
				String m_name = sc.next();
				System.out.println("Enter rating");
				float rating = sc.nextFloat();
				mv[j] = new Movie();
				mv[j].setM_id(m_id);
				mv[j].setM_name(m_name);
				mv[j].setRating(rating);
			}

		}

		for (Theatre th : t) {
			System.out.println(th);
		}

	}

}
