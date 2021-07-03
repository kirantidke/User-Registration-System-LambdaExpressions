package com.bridgelabz.lambdafunction;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User {
	void passwordValidate();
}

public class UserRegistration {

	public static void main(String[] args) {
		// Lambda -> operator uses
		User user = () -> {
			Scanner sc = new Scanner(System.in);

			String regex = "^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

			System.out.println("Enter your Password");
			String password = sc.next();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);
			if (matcher.matches()) {
				System.out.println("Given password is valid");
			} else {
				System.out.println("Given password is not valid");
			}
		};
		user.passwordValidate();

	}
}