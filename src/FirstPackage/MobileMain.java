package FirstPackage;

public class MobileMain {

	public static void main(String[] args) {
		// instantiate a class or creating instance of class
		MobilePhone iPhone = new MobilePhone(); 
		
		//Assigning values to variables based on data type 
		iPhone.brandName = "IPhone";
		iPhone.modelNumber = 12;
		iPhone.operatingSystem = "IOS";
		iPhone.screenSize=5.5;
		iPhone.storagecapacity=8;
		iPhone.isCameraPresent=true;
		
		// calling/invoking different method 
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takePictures();
		//iPhone here is object and make call is method
		
		System.out.println("*******************************************");
		
		// instantiate a class in Java
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 22;
		samsung.operatingSystem = "Android";
		samsung.screenSize=12.5;
		samsung.storagecapacity=8;
		samsung.isCameraPresent=true;
		samsung.makeCalls();
		samsung.sendTextMessage();
		samsung.takePictures();
	}

}
