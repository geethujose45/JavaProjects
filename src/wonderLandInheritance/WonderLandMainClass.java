package wonderLandInheritance;

import java.util.Scanner;

public class WonderLandMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HandleEmployeesAndRides handleEmpAndRides = new HandleEmployeesAndRides();
		System.out.println("Press 1 if you are an employee of wonderland");
		System.out.println("Press 2 if you are an vistor of wonderland");
		String userType = sc.next();

		switch (userType) {

		case "1":
			handleEmpAndRides.handleEmployees();
			break;
		case "2":
			handleEmpAndRides.handleRides();
			break;
		default:
			System.out.println("Invalid Selection");
			break;
		}
		sc.close();
	}
}
