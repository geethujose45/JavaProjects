package arrayAssignment;

import java.util.Scanner;

public class ArrayAssignmentClass {

	String phoneBrandName;
	String mobileRequest;
	String product;
	String enteredProduct;
	String[] samsungMobile = new String[4];
	String[] appleMobile = new String[4];
	String[] googleMobile = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
	Scanner sc = new Scanner(System.in);

	void samsungMobileAvailable() {

		samsungMobile[0] = "S20";
		samsungMobile[1] = "S21";
		samsungMobile[2] = "Flip 3";
		samsungMobile[3] = "Fold 3 ";
		System.out.println("Available Samsung Mobiles");
		System.out.println(samsungMobile[0]);
		System.out.println(samsungMobile[1]);
		System.out.println(samsungMobile[2]);
		System.out.println(samsungMobile[3]);
	}

	void googleMobileAvailable() {

		System.out.println("Available Google Mobiles");
		System.out.println(googleMobile[0]);
		System.out.println(googleMobile[1]);
		System.out.println(googleMobile[2]);
		System.out.println(googleMobile[3]);

	}

	void appleMobilesAvailable() {

		appleMobile[0] = "iphone 12";
		appleMobile[1] = "iphone 12 Mini";
		appleMobile[2] = "iphone 11";
		appleMobile[3] = "iphone 11";
		System.out.println("Available Apple Mobiles");
		System.out.println(appleMobile[0]);
		System.out.println(appleMobile[1]);
		System.out.println(appleMobile[2]);
		System.out.println(appleMobile[3]);

	}

	void selectMobileBrand() {
		int i;

		switch (mobileRequest) {

		case "samsung":

			samsungMobileAvailable();

			System.out.print("Enter the product name: ");
			enteredProduct = sc.nextLine();

			for (i = 0; i < samsungMobile.length; i++) {
				if (enteredProduct.equalsIgnoreCase(samsungMobile[i])) {
					break;
				}
			}

			if (i < samsungMobile.length) {
				System.out.println("Name " +(samsungMobile[i])+ " is present in the array at index " + i);
				break;
			} else {
				System.out.println("Name is not present in the array");
				break;
			}

		case "google":

			googleMobileAvailable();
			
			System.out.print("Enter the product name: ");
			enteredProduct = sc.nextLine();
			
			for (i = 0; i < googleMobile.length; i++) {
				if (enteredProduct.equalsIgnoreCase(googleMobile[i])) {
					break;
				}
			}

			if (i < googleMobile.length) {
				System.out.println("Name " +(googleMobile[i])+ " is present in the array at index " + i);
				break;
			} else {
				System.out.println("Name is not present in the array");
				break;
			}
		case "apple":

			appleMobilesAvailable();

			System.out.print("Enter the product name: ");
			enteredProduct = sc.nextLine();

			for (i = 0; i < appleMobile.length; i++) {
				if (enteredProduct.equalsIgnoreCase(appleMobile[i])) {
					break;
				}
			}

			if (i < appleMobile.length) {
				System.out.println("Name " +(appleMobile[i])+ " is present in the array at index " + i);
				break;
			} else {
				System.out.println("Name is not present in the array");
				break;
			}
	
		default:
			System.out.println("Invalid Input");
			break;
		}

	}
}
