package tankAssignment;

public class TankClass {
	int intialPoint;
	int endPoint;

	void tankCapacity() {
		while (intialPoint <= 100) {
			if (intialPoint == 100) {
				System.out.println("Tank reached its maximum capacity");
				break;
			}
			intialPoint += 10;
			System.out.println("liter of water added to tank in each iteration ");
			System.out.println(intialPoint+ " Liters");
		}
	}

}
