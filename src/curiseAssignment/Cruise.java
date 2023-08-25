package curiseAssignment;

public abstract class Cruise {

	private String cruiseName;
	private double adultTicketPrice;
	private double childTicketPrice;
	private int numberOfDays;

	public Cruise(String cruiseName, double adultTicketPrice, double childTicketPrice, int numberOfDays) {
		this.setAdultTicketPrice(adultTicketPrice);
		this.setChildTicketPrice(childTicketPrice);
		this.setCruiseName(cruiseName);
		this.setNumberOfDays(numberOfDays);
	}

	public abstract double calculatePrice(int adults, int children, boolean meals);

	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	public double getAdultTicketPrice() {
		return adultTicketPrice;
	}

	public void setAdultTicketPrice(double adultTicketPrice) {
		this.adultTicketPrice = adultTicketPrice;
	}

	public double getChildTicketPrice() {
		return childTicketPrice;
	}

	public void setChildTicketPrice(double childTicketPrice) {
		this.childTicketPrice = childTicketPrice;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

}
