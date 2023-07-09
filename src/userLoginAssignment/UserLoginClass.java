
package userLoginAssignment;

import java.util.Scanner;

public class UserLoginClass {
	String password;
	String confirmPassword;
	String userName;
	String confirmUserName;
	int attempt;
	Scanner readLogindetails = new Scanner(System.in);

	void loginUser() {

		while (attempt < 3) {
			System.out.println("Enter the username");
			String confirmUserName = readLogindetails.nextLine();

			System.out.println("Enter the password");
			String confirmPassword = readLogindetails.nextLine();

			if (password.equals(confirmPassword) && userName.equals(confirmUserName)) {
				System.out.println("You are logged in to the application.");
				break;

			} else {
				attempt++;
				System.out.println("Incorrect User id or password. Try again.");
				if (attempt == 3) {
					System.out.println("Maximum login attempts exceeded. Account locked.");
				}
			}
		}
	}
}
