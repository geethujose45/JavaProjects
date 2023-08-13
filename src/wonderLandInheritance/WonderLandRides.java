package wonderLandInheritance;

public class WonderLandRides {

	String nameOfRide;
	private int weight;
	private int minimumHeight;
	ridesType typeOfRide;

	public WonderLandRides(String nameOfRide, int weight, int minimumHeight, ridesType rides) {

		this.nameOfRide = nameOfRide;
		this.weight = weight;
		this.minimumHeight = minimumHeight;
		typeOfRide = rides;

	}

	enum ridesType {

		DRYRIDE("Dryride"), 
		WATERRIDE("Waterride");

		String typeOfRide;

		ridesType(String rides) {
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
		System.out.println("Display Water rides in wonderland");

	}

	public void getDryrides() {
		System.out.println("Display Dry rides in wonderland");

	}

	public boolean isEligible(int userHeight, int userWeight) {
	    boolean validHeight = userHeight >= minimumHeight;
	    boolean validWeight = userWeight <= weight;
	    return validHeight && validWeight;
	}

	public void description() {
		System.out.println(
				"Canada's Wonderland is one of the premier amusement parks in Canada and is known for its thrilling rides,\nfamily-friendly attractions, entertainment shows, and water park.\nIt spans over 330 acres and offers\na wide range of experiences for visitors of all ages. ");
	}
	public void description(boolean includeRideDetails) {
	    description();

	    if (includeRideDetails) {
	    	 System.out.println("Rides in Wonderland");
	        System.out.println("Rides in Wonderland");
	        for (WonderLandRides ride : getAllRides()) {
	            System.out.println(ride.nameOfRide);
	        }
	    }
	}
	public WonderLandRides[] getAllRides() {
		WonderLandRides[] allRides = new WonderLandRides[10];

		allRides[0] = new WonderLandRides("Lakeside Lagoon Slides", 55, 110, ridesType.WATERRIDE);
		allRides[1] = new WonderLandRides("Lazy River", 60, 156, ridesType.WATERRIDE);
		allRides[2] = new WonderLandRides("Riptide Racer", 55, 110, ridesType.WATERRIDE);
		allRides[3] = new WonderLandRides("Splash Station", 40, 100, ridesType.WATERRIDE);
		allRides[4] = new WonderLandRides("Super Soaker", 40, 100, ridesType.WATERRIDE);
		allRides[5] = new WonderLandRides("Roaler Coaster", 45, 1, ridesType.DRYRIDE);
		allRides[6] = new WonderLandRides("Riptide", 55, 154, ridesType.DRYRIDE);
		allRides[7] = new WonderLandRides("Sally's Love Buggies", 35, 144, ridesType.DRYRIDE);
		allRides[8] = new WonderLandRides("Shockwave", 55, 154, ridesType.DRYRIDE);
		allRides[9] = new WonderLandRides("Silver Streak", 45, 144, ridesType.DRYRIDE);

		return allRides;
	}

}
