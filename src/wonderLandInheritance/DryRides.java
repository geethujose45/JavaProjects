package wonderLandInheritance;

public class DryRides extends WonderLand {

	public DryRides(String rideName, int trillevel, int height, ridesType rides) {
		super(rideName, trillevel, height, rides);
	}

	public void callGetWetRides() {
		getDryrides();
	}
}
