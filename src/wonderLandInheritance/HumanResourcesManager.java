package wonderLandInheritance;

public class HumanResourcesManager extends ManagementLevelEmployees {
	
	double discountPercentage;
	double ticketPrice;

	public HumanResourcesManager(int id, String nameOfEmp, double discountPercentage, double ticketPrice) {
		super(id, nameOfEmp, discountPercentage, ticketPrice);
		this.discountPercentage = discountPercentage;
		this.ticketPrice = ticketPrice;
	}

	public void calculateEmployeeDiscount() {
		discountPercentage = 20;
		ticketPrice = 158 * (discountPercentage/100);
		System.out.println(ticketPrice);
	}
}
