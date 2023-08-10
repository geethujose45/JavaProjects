package wonderLandInheritance;

public class WonderLand {

	int levelOfTrill;
	String nameOfRide;
	String attractionType;
	int minimumHeight;
	ridesType typeOfRide;

	public WonderLand(String rideName, int trillevel, int height, ridesType rides) {

		nameOfRide = rideName;
		levelOfTrill = trillevel;
		minimumHeight = height;
		typeOfRide = rides;

	}

	enum ridesType {

		DRYRIDE("Dryride"), WATERRIDE("Waterride");

		String typeOfRide;

		private ridesType(String rides) {
			typeOfRide = rides;
		}

		String getRidesType() {
			return typeOfRide;
		}
	}

	public ridesType typeOfRide() {
		return typeOfRide;
	}

	public void getWaterrides() {
		WonderLand[] waterRides = new WonderLand[5];
		waterRides[0] = new WonderLand("Lakeside Lagoon Slides", 3, 0, typeOfRide.WATERRIDE);
		waterRides[1] = new WonderLand("Lazy River", 2, 42, typeOfRide.WATERRIDE);
		waterRides[2] = new WonderLand("Riptide Racer", 5, 42, typeOfRide.WATERRIDE);
		waterRides[3] = new WonderLand("Splash Station", 4, 54, typeOfRide.WATERRIDE);
		waterRides[4] = new WonderLand("Super Soaker", 3, 48, typeOfRide.WATERRIDE);
		System.out.println("________________________________");
		System.out.println("Water rides in WonderLand");
		System.out.println("________________________________");
		for (int i = 0; i < waterRides.length; i++) {
			System.out.println(waterRides[i].nameOfRide);

		}
	}

	public void getDryrides() {
		WonderLand[] dryRides = new WonderLand[5];
		dryRides[0] = new WonderLand("Roaler Coaster", 5, 45, typeOfRide.DRYRIDE);
		dryRides[1] = new WonderLand("Riptide", 4, 54, typeOfRide.DRYRIDE);
		dryRides[2] = new WonderLand("Sally's Love Buggies", 3, 44, typeOfRide.DRYRIDE);
		dryRides[3] = new WonderLand("Shockwave", 5, 54, typeOfRide.DRYRIDE);
		dryRides[4] = new WonderLand("Silver Streak", 4, 44, typeOfRide.DRYRIDE);
		System.out.println("________________________________");
		System.out.println("Wet rides in WonderLand:");
		System.out.println("________________________________");
		for (int i = 0; i < dryRides.length; i++) {
			System.out.println(dryRides[i].nameOfRide);

		}
	}

}
