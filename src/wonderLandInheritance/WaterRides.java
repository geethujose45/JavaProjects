package wonderLandInheritance;

public class WaterRides extends WonderLandRides {

	public WaterRides(String rideName, int trillevel, int height, ridesType rides) {
		super(rideName, trillevel, height, rides);
	}

	@Override
	public void description() {
		System.out.println(
				"Canada's Wonderland offers a variety of water rides and attractions in its water park area known as Splash Works.");
	}

	@Override
	public void getWaterrides() {
		WonderLandRides[] waterRides = new WonderLandRides[5];
		waterRides[0] = new WonderLandRides("Lakeside Lagoon Slides", 55, 110, typeOfRide.WATERRIDE);
		waterRides[1] = new WonderLandRides("Lazy River", 60, 156, typeOfRide.WATERRIDE);
		waterRides[2] = new WonderLandRides("Riptide Racer", 55, 110, typeOfRide.WATERRIDE);
		waterRides[3] = new WonderLandRides("Splash Station", 40, 100, typeOfRide.WATERRIDE);
		waterRides[4] = new WonderLandRides("Super Soaker", 40, 100, typeOfRide.WATERRIDE);
		System.out.println("________________________________");
		System.out.println("Water rides in WonderLand");
		System.out.println("________________________________");
		for (int i = 0; i < waterRides.length; i++) {
			System.out.println(waterRides[i].nameOfRide);

		}
	}
}
