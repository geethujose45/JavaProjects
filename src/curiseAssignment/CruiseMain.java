package curiseAssignment;

import java.util.Scanner;

public class CruiseMain {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User user = UserSignUp.signUp(sc);
		System.out.println("Thank you for registering!");

		boolean loggedIn = false;
		while (!loggedIn) {
			System.out.println("Please log in.");
			System.out.print("Username: ");
			String usernameInput = sc.nextLine();
			System.out.print("Password: ");
			String passwordInput = sc.nextLine();

			if (user.getUserName().equals(usernameInput) && user.getPassword().equals(passwordInput)) {
				loggedIn = true;
				System.out.println("Logged in successfully!");
			} else {
				System.out.println("Invalid username or password. Please try again.");
			}
		}
		CruiseManagement.runCruiseBooking(user);
		ChangePersonalDetails.changePersonalInfo(sc, user);
	}


}
