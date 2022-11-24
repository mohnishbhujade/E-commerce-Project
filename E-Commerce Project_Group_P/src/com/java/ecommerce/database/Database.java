package com.java.ecommerce.database;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	
	static String name;
	static String email;
	static String password;
	 public Database() {
		 this.name=name;
		 this.email=email;
		 this.password=password;
	}
	public Database(String name, String email, String password) {
		this.name=name;
		 this.email=email;
		 this.password=password;
	}
	public static void registerUser(){
		 
		 	ArrayList list = new ArrayList();
		 Scanner scanner = new Scanner(System.in);
		 	System.out.println("Please Enter your information.");
		 	System.out.println("Enter your name");
		 		 name =scanner.next(); 
		 	System.out.println("Enter your email  ");
		 		 email = scanner.next();
		 	System.out.println("Enter your Password..");
		 		 password = scanner.next();
		 		
		 		System.out.println("registered successfully..");
		 Database database = new Database(name,email,password);
		 list.add(database);
	 }
	 public static void logIn() {
		 Scanner scanner = new Scanner(System.in);
		 	System.out.println("Enter your email");
		 		String email1= scanner.next();
		 	System.out.println("Enter your Password..");
		 		String password1 = scanner.next();
		 	
		 		if((email1.equals(email))&&(password1.equals(password))) {
		 			System.out.println("You have logged in successfully..");
		 			
		 		}
		 		else {
		 			System.out.println("Your email or Password is Incorrect");
		 		}
		 		
		 	
		 	
	 }

}
