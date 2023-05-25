package com.arrayOfObject;
import java.util.Scanner;

public class Student {
	int sid;
	String sName;
	double marks;
	
	public Student(int sid, String sName, double marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "sid = " + sid + ", sName = " + sName + ", marks = " + marks +"%";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student sd[] = new Student[4];
		for(int i=0; i<sd.length; i++)
		{
			System.out.println("Enter Student Id:");
			int sid = sc.nextInt();
			System.out.println("Enter Student Name:");
			String sName = sc.next();
			System.out.println("Enter Percentage Marks:");
			double marks = sc.nextDouble();
			sd[i] = new Student(sid, sName, marks);
		}
		sc.close();
		System.out.println("--------------------------------------------");
		for(int i=0; i<sd.length; i++)
		{
			System.out.println("sid: "+ sd[i].sid +" sNAme: "+ sd[i].sName +" Perc: "+ sd[i].marks +"%");
		}
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<sd.length; i++)
		{
			System.out.println(sd[i]);
		}
		
		System.out.println("--------------------------------------------");
		for(Student s:sd)
		{
			System.out.println(s);
		}
		
//		Displaying students who got more than 70% marks.
		System.out.println("--------------------------------------------");
		for(Student s:sd)
		{
			if(s.marks>70)
			{
				System.out.println(s);
			}
		}
	}
}
