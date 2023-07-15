package arrayAssignment;

import java.util.Scanner;

public class ArrayAssignmentMainClass {

	public static void main(String[] args) {
		ArrayAssignmentClass mobileBrand = new ArrayAssignmentClass();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the product request for apple,samsung,google : ");
		mobileBrand.mobileRequest=sc.next();
		mobileBrand.selectMobileBrand();
		
		
		sc.close();

	}

}
