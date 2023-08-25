package curiseAssignment;

public class SunsetCruise extends Cruise{

	public SunsetCruise(String cruiseName, double adultTicketPrice, double childTicketPrice, int numberOfDays) {
		super(cruiseName, adultTicketPrice, childTicketPrice, numberOfDays);
		
	}
	public SunsetCruise() {
		super("Sunset Cruise", 52.99, 15.99, 1);
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
