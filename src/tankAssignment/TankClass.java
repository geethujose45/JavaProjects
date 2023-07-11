package tankAssignment;

public class TankClass {
	int intialWaterLevel;
	int totalCapcity;

	void tankCapacity() {
		while (intialWaterLevel <= totalCapcity) {
			if (intialWaterLevel+10 > totalCapcity) {
				System.out.println("Tank reached its maximum capacity,Tank overflow alert!");
				break;
			}
			intialWaterLevel += 10;
			System.out.println("liter of water added to tank in each iteration ");
			System.out.println(intialWaterLevel + " Liters");
		}
	}

}
