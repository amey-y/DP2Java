package com.labAssignments;
import java.util.Scanner;
public class A1_Problem3 {

	public static void main(String[] args) {
//		Nila uses pencils to write at school and at home.
//		When she was in her 1st standard, her parents bought her one pencil. 
//		In her 2nd standard, she needed 5 pencils, and in 3rd standard, she needed 14 pencils and so on. 
//		How many pencils does she get from the provided standard?
//		Note : If the input given is not between 1 to 12  then the output should be "Invalid Standard"
//		1,5,14,......n
		Scanner sc=new Scanner(System.in);
		int std = sc.nextInt();
		sc.close();
		int pencils = 0;
		
		if(std>=1&&std<=12)
		{
			for(int i=1; i<=std; i++)
			{
				pencils += i*i;
			}
			System.out.println(pencils);
		}
		else {
			System.out.println("Invalid Standard");
		}
	}
}
