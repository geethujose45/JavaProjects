package wonderLandInheritance;

import wonderLandInheritance.WonderLand.ridesType;

public class WonderLandMainClass {
	public static void main(String[] args) {
		
		WonderLand rides;
		rides=new DryRides("demo", 1, 1, ridesType.DRYRIDE);
		rides.getDryrides();
		rides=new WaterRides("demo", 1, 1, ridesType.WATERRIDE);
		rides.getWaterrides();

	}
}
