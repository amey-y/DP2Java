package com.labAssignments2;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
//	Q1
	int rollNo;
	String name;
	int age;
	int marks;

	public Students(int rollNo, String name, int age, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", marks=" + marks + "]\n";
	}

	public static void display(Students[] std) {
		for (Students s : std) {
			if (s.marks > 60 && s.age < 15) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students: ");
		int stdnum = sc.nextInt();
		Students[] std = new Students[stdnum];
		System.out.println("Enter Student Details: ");
		for (int i = 0; i < stdnum; i++) {
			System.out.println("Enter roll number: ");
			int rollNo = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("Enter marks: ");
			int marks = sc.nextInt();
			std[i] = new Students(rollNo, name, age, marks);
		}

		System.out.println(Arrays.toString(std));
		Students.display(std);

	}

}
