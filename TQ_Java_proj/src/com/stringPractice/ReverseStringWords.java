package com.stringPractice;
import java.util.Scanner;
public class ReverseStringWords {
//	WAP to reverse each word from the string except 1st and last word
	public String reversWord(String st)
	{
		String []words = st.split(" ");
		String finalstr = "";
		for(int i=1; i<words.length-1; i++)
		{
			String wordstr = "";
			for(int j=words[i].length()-1; j>=0; j--)
			{
				wordstr += words[i].charAt(j);
			}
			finalstr += wordstr +" ";
		}
		return words[0] +" "+ finalstr + words[words.length-1];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st = sc.nextLine();
		sc.close();
		
		ReverseStringWords rs = new ReverseStringWords();
		System.out.println(rs.reversWord(st));
	}

}
