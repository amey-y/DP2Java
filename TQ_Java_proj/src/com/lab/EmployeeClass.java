package com.lab;

public class EmployeeClass {
	int id;
	String name;
	int salary;
	int age;

	public EmployeeClass(int eid, String ename, int esal, int eage) {
		id = eid;
		name = ename;
		salary = esal;
		age = eage;
	}

	public void display() {
		getBonus();
		System.out.println("Id: " + id + "\nName: " + name + "\nSalary: " + salary + "\nAge: " + age + "\n");
	}

	public int getBonus() {
		if (age > 60) {
			salary = salary + 5000;
		} else if (age > 40) {
			salary = salary + 2000;
		} else {
			salary = salary * 1;
		}
		return salary;
	}

	public static void main(String[] args) {
		EmployeeClass ep = new EmployeeClass(101, "Rushikesh", 120000, 45);
		ep.display();
		EmployeeClass ep2 = new EmployeeClass(102, "Navin", 155000, 62);
		ep2.display();
		EmployeeClass ep3 = new EmployeeClass(103, "Abhishek", 135000, 39);
		ep3.display();
	}

}
