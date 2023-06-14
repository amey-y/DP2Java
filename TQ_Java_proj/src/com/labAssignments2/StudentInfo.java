package com.labAssignments2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentInfo {

	float calculateAvg(int[] marks) {
//		This method should calculate average and set average mark for the current student.
		int sum = 0;
		for (int m : marks) {
			sum += m;
		}
		float average = sum / marks.length;
		return average;
	}

	char findGrade(float average, int[] marks) {
//		This method should set the grade based on the average calculated.
		char grade = 0;
		boolean flag = true;

		for (int m : marks) {
			if (m < 50) {
				grade = 'F';
				flag = false;
				break;
			}
		}

		if (flag) {
			if (average >= 80) {
				grade = 'O';
			} else if (average >= 50 && average <= 79) {
				grade = 'A';
			} else {
				grade = 'F';
			}
		}

		return grade;
	}

	public void display(Student[] std) {
		for (Student s : std) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		StudentInfo si = new StudentInfo();
		System.out.println("Enter no. of Students you want to add: ");
		int stdNum = sc.nextInt();
		Student[] std = new Student[stdNum];
		for (int i = 0; i < stdNum; i++) {
			std[i] = new Student();
			System.out.println("Enter Student ID: ");
			int sId = sc.nextInt();
			std[i].setsId(sId);

			System.out.println("Enter Student Name: ");
			String sName = sc.next();
			std[i].setsName(sName);

			System.out.println("Enter marks of 4 subjects: ");
			int marks[] = new int[4];
			for (int j = 0; j < 4; j++) {
				marks[j] = sc.nextInt();
			}
			std[i].setMarks(marks);
			float average = si.calculateAvg(marks);
			std[i].setAverage(average);
			char grade = si.findGrade(average, marks);
			std[i].setGrade(si.findGrade(average, marks));

		}
		si.display(std);

	}

}
