package curiseAssignment;

import java.util.Scanner;

public class ChangePersonalDetails {
	public static void changePersonalInfo(Scanner sc, User user) {
		while (true) {
			System.out.println(
					"Do you want to change your personal information? Press Y to change. Press any other alphabet to exit.");
			String changeOption = sc.nextLine();

			if (!changeOption.equalsIgnoreCase("Y")) {
				break;
			}

			System.out.println("Please enter the information you want to change.");
			System.out.println("1. Password");
			System.out.println("2. Phone number");
			System.out.println("3. Email");

			int changeSelection = sc.nextInt();
			sc.nextLine(); // Consume the newline character

			switch (changeSelection) {
			case 1:
				changePassword(sc, user);
				break;
			case 2:
				changePhoneNumber(sc, user);
				break;
			case 3:
				changeEmail(sc, user);
				break;
			default:
				System.out.println("Invalid selection.");
				break;
			}
		}
	}

	private static void changePassword(Scanner sc, User user) {
		System.out.print("Enter your existing password: ");
		String existingPassword = sc.nextLine();

		if (!existingPassword.equals(user.getPassword())) {
			System.out.println("Incorrect password.");
			return;
		}

		System.out.print("Enter your new password: ");
		String newPassword = sc.nextLine();

		user.setPassword(newPassword);

		System.out.println("Your password has been changed!");
	}

	private static void changePhoneNumber(Scanner scanner, User user) {
		System.out.print("Enter your new phone number: ");
		int newPhoneNumber = scanner.nextInt();

		user.setPhoneNumber(newPhoneNumber);

		System.out.println("Your phone number has been changed!");
	}

	private static void changeEmail(Scanner scanner, User user) {
		System.out.print("Enter your new email address: ");
		String newEmail = scanner.nextLine();

		user.setUserName(newEmail);

		System.out.println("Your email address has been changed!");
	}
}
