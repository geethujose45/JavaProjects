package curiseAssignment;

public class DiscoveryCruise extends Cruise {

	public DiscoveryCruise(String cruiseName, double adultTicketPrice, double childTicketPrice, int numberOfDays) {
		super(cruiseName, adultTicketPrice, childTicketPrice, numberOfDays);

	}

	public DiscoveryCruise() {
		super("Discovery Cruise", 39.99, 9.99, 4);
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
