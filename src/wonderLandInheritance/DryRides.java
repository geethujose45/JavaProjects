package wonderLandInheritance;

import wonderLandInheritance.WonderLandRides.ridesType;

public class DryRides extends WonderLandRides {

	public DryRides(String rideName, int trillevel, int height, ridesType rides) {
		super(rideName, trillevel, height, rides);
	}

	@Override
	public void description() {
		System.out.println(
				" Canada's Wonderland offers a variety of dry rides and attractions throughout the park.\n These rides cater to different age groups and thrill levels, providing a well-rounded\n experience for visitors.");
	}

	@Override
	public void getDryrides() {
		WonderLandRides[] dryRides = new WonderLandRides[5];
		dryRides[0] = new WonderLandRides("Roaler Coaster", 45, 145, typeOfRide.DRYRIDE);
		dryRides[1] = new WonderLandRides("Riptide", 55, 154, typeOfRide.DRYRIDE);
		dryRides[2] = new WonderLandRides("Sally's Love Buggies", 35, 144, typeOfRide.DRYRIDE);
		dryRides[3] = new WonderLandRides("Shockwave", 55, 154, typeOfRide.DRYRIDE);
		dryRides[4] = new WonderLandRides("Silver Streak", 45, 144, typeOfRide.DRYRIDE);
		System.out.println("________________________________");
		System.out.println("Wet rides in WonderLand:");
		System.out.println("________________________________");
		for (int i = 0; i < dryRides.length; i++) {
			System.out.println(dryRides[i].nameOfRide);

		}
	}
}
