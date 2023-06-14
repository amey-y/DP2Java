package com.arraylist;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	int empId;
	String empName;
	Double empSalary;
	String empDept;

	public Employee(int empId, String empName, Double empSalary, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDept=" + empDept + "]";
	}

	public void add() {

//		emp = new ArrayList<>();
//		System.out.println("Enter the number of employees you want add: ");
//		int empNum = sc.nextInt();
//		for (int i = 1; i <= empNum; i++) {
//			System.out.println("Enter Employee ID: ");
//			int empId = sc.nextInt();
//			System.out.println("Enter Employee name: ");
//			String empName = sc.nextLine();
//			System.out.println("Enter Salary: ");
//			Double empSalary = sc.nextDouble();
//			System.out.println("Enter Department: ");
//			String empDept = sc.nextLine();
//			emp.add(new Employee(empId, empName, empSalary, empDept));
//		}

	}

	public void displaySal(ArrayList<Employee> emp2) {

		for (Employee e : emp2) {
			if (e.empSalary > 30000) {
				System.out.println(e);
			}
		}
	}

	public void displaySales(ArrayList<Employee> emp2) {
		for (Employee e : emp2) {
			if (e.empDept.equalsIgnoreCase("sales")) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		ArrayList<Employee> emp2 = new ArrayList<>();
		System.out.println("Enter the number of employees you want add: ");
		int empNum = sc.nextInt();
		for (int i = 1; i <= empNum; i++) {
			System.out.println("Enter Employee ID: ");
			int empId = sc.nextInt();
			System.out.println("Enter Employee name: ");
			String empName = sc.next();
			System.out.println("Enter Salary: ");
			Double empSalary = sc.nextDouble();
			System.out.println("Enter Department: ");
			String empDept = sc.next();
			emp2.add(new Employee(empId, empName, empSalary, empDept));

		}
		System.out.println("salary more than 30K:");
		emp.displaySal(emp2);
		System.out.println("\nfrom sales dept:");
		emp.displaySales(emp2);

	}
}
