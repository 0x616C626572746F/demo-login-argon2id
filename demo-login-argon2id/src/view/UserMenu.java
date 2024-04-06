package view;

import java.util.Scanner;

import model.User;
import service.UserService;

public class UserMenu {

	private static Scanner sc = new Scanner(System.in);
	private static UserService us = new UserService();
	
	public static void main(String[] args) {
		String option;
		do {
			showMenu();
			System.out.print("Choose an option: ");
			option = sc.nextLine();
			switch (option) {
			case "1":
				registerUser();
				break;
			case "2":
				checkLogin();
				break;
			case "3":
				System.out.println("Bye.");
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		} while (!option.equals("3"));
		
		sc.close();
	}

	private static void checkLogin() {
		String username;
		String password;
		
		System.out.print("Insert the username: ");
		username = sc.nextLine();
		
		if (username.isBlank() || username.isEmpty()) {
			System.out.println("The username can't be blank.");
			return;
		}
		
		System.out.print("Insert the password: ");
		password = sc.nextLine();
		
		if (password.isBlank() || password.isEmpty()) {
			System.out.println("The password can't be blank.");
			return;
		}
		
		if (us.checkLogin(new User(username, password))) {
			System.out.println("Welcome again " + username);
		} else {
			System.out.println("Invalid credentials.");
		}
	}

	private static void registerUser() {
		String username;
		String password;
		
		System.out.print("Insert the username: ");
		username = sc.nextLine();
		
		if (username.isBlank() || username.isEmpty()) {
			System.out.println("The username can't be blank.");
			return;
		}
		
		System.out.print("Insert the password: ");
		password = sc.nextLine();
		
		if (password.isBlank() || password.isEmpty()) {
			System.out.println("The password can't be blank.");
			return;
		}
		
		if (us.registerUser(new User(username, password))) {
			System.out.println("Successfully registered.");
		} else {
			System.out.println("A user with the same name already exists.");
		}
	}

	private static void showMenu() {
		System.out.println("1.- Register user\n2.- Login\n3.- Exit");
	}

}
