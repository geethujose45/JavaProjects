package curiseAssignment;

import java.util.Scanner;

public class CruiseManagement {
	public static void runCruiseBooking(User user) {
	Scanner sc = new Scanner(System.in);
	Cruise[] cruiseList = { new ScenicCruise(), new SunsetCruise(), new DiscoveryCruise(), new MysteryCruise() };

	System.out.println(
			"We offer 4 different packages as displayed below. Please enter the cruise that you want to\r\n"
					+ "select");

	for (Cruise cruise : cruiseList) {
		System.out.println(cruise.getCruiseName());
	}
	String selectedCruise = sc.nextLine();

	Cruise cruise = null;
	for (Cruise c : cruiseList) {
		if (c.getCruiseName().equals(selectedCruise)) {
			cruise = c;
			break;
		}
	}

	if (cruise == null) {
		System.out.println("Invalid cruise selection.");
		return;
	}
	System.out.println("The cruise that you have selected is " + cruise.getCruiseName() + " which is a "
			+ cruise.getNumberOfDays() + " day cruise");
	System.out.println("Price for Adults(greater than 12) : " + cruise.getAdultTicketPrice() + " per days");
	System.out.println("Price for kids above 5 : " + cruise.getChildTicketPrice() + " per days");
	System.out.println(
			"Please press Y if you want to continue with the selection or press any other alphabet to select another.");
	String needContinue = sc.next();
	if (!needContinue.equalsIgnoreCase("Y")) {
		return;
	}
	System.out.println("Enter the number of adults");
	int numberOfAdults = sc.nextInt();

	System.out.println("Enter the number of Children");
	int numberOfChildren = sc.nextInt();

	int[] childAges = new int[numberOfChildren];
	if (numberOfChildren > 0) {
		for (int i = 0; i < numberOfChildren; i++) {
			System.out.print("Enter the age of child " + (i + 1) + ": ");
			childAges[i] = sc.nextInt();

		}
	}

	System.out.println(
			"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals?");
	String mealsOption = sc.nextLine();

	boolean isMealsIncluded = mealsOption.equalsIgnoreCase("Yes");

	double totalPrice = cruise.calculatePrice(numberOfAdults, numberOfChildren, isMealsIncluded);
	double hst = totalPrice * 0.15;
	double finalPrice = totalPrice + hst;

	System.out.println("Your Package includes:");
	System.out.println(cruise.getCruiseName() + " Adults @ " + numberOfAdults + " : $"
			+ (numberOfAdults * cruise.getAdultTicketPrice() * cruise.getNumberOfDays()));
	System.out.println(cruise.getCruiseName() + " Children (>5) @ " + numberOfChildren + " : $"
			+ (numberOfChildren * cruise.getChildTicketPrice() * cruise.getNumberOfDays()));
	if (isMealsIncluded) {
		System.out.println("Buffet Special Price Adults @ " + numberOfAdults + " : $"
				+ (numberOfAdults * 20.99 * cruise.getNumberOfDays()));
		System.out.println("Buffet Special Price Children (>5) @ " + numberOfChildren + " : $"
				+ (numberOfChildren * 4.99 * cruise.getNumberOfDays()));
	}
	System.out.println("Total Price: $" + totalPrice);
	System.out.println("HST @ 15%: $" + hst);
	System.out.println("Final Price: $" + finalPrice);
}
}
