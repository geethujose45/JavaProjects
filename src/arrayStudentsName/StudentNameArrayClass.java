package arrayStudentsName;

import java.util.Scanner;

public class StudentNameArrayClass {

	String[] names = new String[5];

	Scanner sc = new Scanner(System.in);

	void populateNameArray() {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name: " + (i + 1));
			names[i] = sc.next();
		}
	}

	void printNames() {
		System.out.println("Students Name");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	void findNameInArray() {
		String enteredName;
		int i;
		int count = 0;

		System.out.print("Enter the student's name: ");
		enteredName = sc.next();

		for (i = 0; i < names.length; i++) {
			if (enteredName.equals(names[i])) {
				count++;
			}
			
		}

		if (count > 0) {
			System.out.println("Name "+enteredName+ " is present "+ count + " times in the array");
		} else {
			System.out.println("Name is not present in the array.");
		}
	}

}
