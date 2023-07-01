package laptopPackage;

public class MainLaptop {

	public static void main(String[] args) {
		Laptop Dell=new Laptop();
		Dell.brandName="Dell";
		Dell.modelNumber=2343;
		Dell.RAM=8;
		Dell.ROM=8;
		Dell.displayType="LCD";
		Dell.battery=8;
		Dell.screensize=15;
		Dell.watchVedio();
		Dell.browseInternet();
		Dell.playGames();
		
		Laptop HP = new Laptop();
		HP.brandName="HP";
		HP.modelNumber=1258;
		HP.RAM=8;
		HP.ROM=8;
		HP.displayType="LED";
		HP.battery=8;
		HP.screensize=16.5;
		HP.browseInternet();
		HP.watchVedio();
		HP.playGames();
	}

}
