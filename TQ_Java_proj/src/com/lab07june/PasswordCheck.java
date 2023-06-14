package com.lab07june;

import java.util.Scanner;

class IncorrectPasswordLengthException extends RuntimeException {
	IncorrectPasswordLengthException() {
		super();
	}

	IncorrectPasswordLengthException(String msg) {
		super(msg);
	}
 
}

public class PasswordCheck {

	public void checkPass(String uname, String pwd) {
		if (pwd.length() < 8) {
			throw new IncorrectPasswordLengthException("Password length should be greater than 8.");
		} else {
			System.out.println("Login Succesful!");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String uname = sc.next();
		System.out.println("Enter password: ");
		String pwd = sc.next();

		PasswordCheck pc = new PasswordCheck();
		pc.checkPass(uname, pwd);

	}

}
