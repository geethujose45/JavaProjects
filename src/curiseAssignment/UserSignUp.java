package curiseAssignment;

import java.util.Scanner;

public class UserSignUp {

	static User signUp(Scanner sc) {
		System.out.println("Welcome to Cruise Booking.");
		System.out.println("Please sign up to book a cruise.");

		System.out.print("Enter your email address: ");
		String email = sc.nextLine();

		System.out.print("Enter the password that you want to use: ");
		String password = sc.nextLine();

		System.out.print("Enter User Name: ");
		String name = sc.nextLine();

		System.out.print("Enter your phone number: ");
		String phoneNumber = sc.nextLine();

		User user = new User(name, password, name, 0);

		return user;
	}

}
