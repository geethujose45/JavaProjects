package curiseAssignment;

public class ScenicCruise extends Cruise {

	public ScenicCruise(String cruiseName, double adultTicketPrice, double childTicketPrice, int numberOfDays) {
		super(cruiseName, adultTicketPrice, childTicketPrice, numberOfDays);

	}

	public ScenicCruise() {
		super("Scenic Cruise", 43.99, 12.99, 3);
	}

	public double calculatePrice(int adults, int children, boolean meals) {
		double withoutMealCost = (adults * getAdultTicketPrice() + children * getChildTicketPrice())
				* getNumberOfDays();
		double withMealCost = (adults * 20.99 + children * 4.99) * getNumberOfDays();
		double totalPrice;
	    if (meals) {
	        totalPrice = withoutMealCost + withMealCost;
	    } else {
	        totalPrice = withoutMealCost;
	    }
	    
	    return totalPrice;
	}
}
