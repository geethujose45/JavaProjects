package wonderLandInheritance;

public class WaterRides extends WonderLand {

	public WaterRides(String rideName, int trillevel, int height, ridesType rides) {
		super(rideName, trillevel, height, rides);
	}

	public void callGetWaterRides() {
		getWaterrides();
	}
}
