package com.basic;
import java.util.Scanner;

public class AlphabetDigitSpecialChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Character Checker***");
		System.out.println("***Enter a Alphabet / Digit / Special Character: ");
		
		char ch= sc.next().charAt(0);
		sc.close();
		
		if (ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f'||ch=='g'||ch=='h'||ch=='i'||ch=='j'||ch=='k'||ch=='l'||ch=='m'
				||ch=='n'||ch=='o'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='u'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z')
		{
			System.out.println(ch+" is a Alphabet!");
		}
		else if (ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
		{
			System.out.println(ch+" is a Digit!");
		}
		else
		{
			System.out.println(ch+" is a Special Character!");
		}

	}

}
