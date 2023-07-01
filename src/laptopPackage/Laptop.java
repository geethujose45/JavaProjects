package laptopPackage;

public class Laptop {
	String brandName;
	int modelNumber;
	double screensize;
	String displayType;
	int RAM;
	int ROM;
	int battery; 	

	void watchVedio() {
		System.out.println("You can watch vedios in " +brandName);
	}
	void browseInternet() {
		System.out.println("You can browse internet in " +brandName);
	}
	void playGames() {
		System.out.println("You can play games in " +brandName );
	}
	
	}
