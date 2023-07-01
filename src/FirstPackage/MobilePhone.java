package FirstPackage;

public class MobilePhone {
	
	String brandName;
	int modelNumber;
	double screenSize;
	int storagecapacity;
	String operatingSystem;
	boolean isCameraPresent;
	
	void makeCalls(){
		System.out.println("Making calls from phone."+brandName+modelNumber);
	}
	void sendTextMessage() {
		System.out.println("Send text message."+brandName+modelNumber);
	}
	void takePictures() {
		System.out.println("Taking pictures."+brandName+modelNumber);
	}
	
}
