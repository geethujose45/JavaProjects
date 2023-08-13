package wonderLandInheritance;

public class ManagementLevelEmployees extends Employees {

	private double discountPercentage;
	private double ticketPrice;

	public ManagementLevelEmployees(int id, String nameOfEmp, double discountPercentage, double ticketPrice) {
		super(id, nameOfEmp);
		this.discountPercentage = discountPercentage;
		this.ticketPrice = ticketPrice;
	}

	public void calculateEmployeeDiscount() {
		discountPercentage = 50;
		ticketPrice = 158 - (158 * (discountPercentage / 100));
	    System.out.println("Discounted ticket price: $" + ticketPrice);
	}

}
