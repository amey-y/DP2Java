package com.lab;

public class Problem07_Pattern02 {

	public static void main(String[] args) {
		
		int n = 3;            
        for (int i = 1; i <= n; i++) {
            // Print the spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the first half of the row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print the second half of the row
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
		
		
	}

}
