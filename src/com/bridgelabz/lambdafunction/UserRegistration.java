package com.bridgelabz.lambdafunction;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface EmailId {
	void emailValidate();
}

public class UserRegistration {

	public static void main(String[] args) {
		// Lambda -> operator uses
		EmailId eMail = () -> {
			 Scanner sc = new Scanner(System.in);

	            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

	            System.out.println("Enter your Email id");
	            String email = sc.next();

	            Pattern pattern = Pattern.compile(regex);
	            Matcher matcher = pattern.matcher(email);
	            if(matcher.matches()){
	                System.out.println("Given email id is valid");
	            }else{
	                System.out.println("Given email id is not valid");
	            }
	        };
		eMail.emailValidate();

	}
}
