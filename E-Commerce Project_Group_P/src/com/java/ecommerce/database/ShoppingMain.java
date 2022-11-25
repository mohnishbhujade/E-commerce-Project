package com.java.ecommerce.database;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMain {
		public static void main(String[] args) {
			
			System.out.println("hell..");
			for(;;) {
			System.out.println("1. Register user 2. Log In ");
			Database database = new Database();
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch(ch) {
			case 1: database.registerUser();
						break;
			case 2: database.logIn();
						break;
			//case 3: database;
						
			//case 3: Exit(0);	
						
						
			}}
			
			
			
		}
}
