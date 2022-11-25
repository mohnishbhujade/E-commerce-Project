package com.java.ecommerce.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
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
		 
		 	LinkedList<Database> list = new LinkedList<>();
		 Scanner scanner = new Scanner(System.in);
		 	System.out.println("Please Enter your information.");
		 	System.out.println();
		 	System.out.println("Enter your name");
		 		 name =scanner.next(); 
		 	System.out.println("Enter your email  ");
		 		 email = scanner.next();
		 	System.out.println("Enter your Password..");
		 		 password = scanner.next();
		 		 	
				 Database database = new Database(name,email,password);
		 list.add(database);
		 System.out.println("registered successfully..");
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
	  public static void driverConn() throws SQLException {
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/";
			String user="root";
			String password="Sharad$20";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			//PreparedStatement ps = conn.prepareStatement(sql);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	  }

}
