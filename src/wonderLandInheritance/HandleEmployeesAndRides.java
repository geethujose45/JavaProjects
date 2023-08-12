package wonderLandInheritance;

import java.util.Scanner;

public class HandleEmployeesAndRides {
	Scanner sc = new Scanner(System.in);

	public void handleEmployees() {

		System.out.println("Management employees Press 1 to know the ticket price after discount");
		System.out.println("HR employees Press 2 to know the ticket price after discount");
		String empType = sc.next();
		switch (empType) {
		case "1":
			ManagementLevelEmployees mngEmp = new ManagementLevelEmployees(345, "Kevin", 0.50, 58.50);
			mngEmp.calculateEmployeeDiscount();
			break;
		case "2":
			HumanResourcesManager hrEmp = new HumanResourcesManager(4530, "Meliza", 0.20, 45.50);
			hrEmp.calculateEmployeeDiscount();
			break;

		default:
			break;
		}
	}

	public void handleRides() {
		WonderLandRides wonderLandRides = new WonderLandRides(null, 0, 0, null);
		WonderLandRides[] allRides = wonderLandRides.getAllRides();
		WonderLandRides rides;

		System.out.println("Press 1 for Dry rides");
		System.out.println("Press 2 for Water rides");
		System.out.println("Press 3 for all rides");
		System.out.println("Press 4 to check the ride that you are eligible for");

		String rideType = sc.next();

		switch (rideType) {
		case "1":
			rides = new DryRides(null, 0, 0, null);
			rides.description();
			rides.getDryrides();
			break;
		case "2":
			rides = new WaterRides(null, 0, 0, null);
			rides.description();
			rides.getWaterrides();
			break;
		case "3":
			rides = new WonderLandRides(rideType, 0, 0, null);
			wonderLandRides.description();
			wonderLandRides.getAllRides();
			break;
		case "4":
			System.out.print("Enter your height in cm: ");
			int height = sc.nextInt();

			System.out.print("Enter your weight in kg: ");
			int weight = sc.nextInt();

			System.out.println("Eligible rides:");

			for (WonderLandRides ride : allRides) {
				if (ride.isEligible(height, weight)) {
					System.out.println(ride.nameOfRide);
				}
			}
			break;

		default:
			break;
		}

	}
}
