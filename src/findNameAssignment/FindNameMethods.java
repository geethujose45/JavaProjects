package findNameAssignment;

import java.util.Random;
import java.util.Scanner;

public class FindNameMethods {
	private int count = 0;
	private String studentName;
	private String maskedName;
	private String[] studentsName = { "Manpreeth", "Surya", "Abhishek", "Vaishnavi", "Aman", "Sandeep" };
	private Scanner sc = new Scanner(System.in);

	// Generates a random student name
	
	public String getRandomName() {
		Random generator = new Random();
		int randomIndex = generator.nextInt(studentsName.length);
		return studentsName[randomIndex];
	}

	//Mask the student name and starting the guessing loop
	public void maskName() {
		studentName = getRandomName().toLowerCase();
		maskedName = studentName.replaceAll("[a-zA-Z]", "*");
		System.out.println("GUESS THE STUDENT NAME");
		System.out.println(maskedName);
		guessName(); //Guessing loop starts
	}

	//Guessing a letter in the student name
	
	public void findName(String guess) {
		int index = studentName.indexOf(guess.charAt(0));
		if (index != -1) {
			StringBuilder newMaskedName = new StringBuilder(maskedName);
			while (index != -1) {
				newMaskedName.setCharAt(index, guess.charAt(0));
				index = studentName.indexOf(guess.charAt(0), index + 1);
			}
			maskedName = newMaskedName.toString();
			System.out.println(maskedName);
		} else {
			count++;
			result(); // Show result after a wrong guess
		}
		if (maskedName.equals(studentName)) {
			System.out.println("Correct! You win! The student name was " + studentName);
		}
	}

	// Handles the guessing loop and user input
	public void guessName() {
		while (count < 5 && maskedName.contains("*")) {
			System.out.println("Guess any letter in the word");
			String guess = sc.next().toLowerCase();
			if (guess.isEmpty() || guess.length() > 1) {
				System.out.println("Please enter a single letter.");
				continue;
			}
			findName(guess); // Guessing continues
		}
		sc.close();
	}

	// Displays the result of the game
	
	public void result() {
		if (count >= 1 && count <= 4) {
			System.out.println("Wrong guess, try again");
		}

		if (count == 5) {
			System.out.println("GAME OVER!");
			System.out.println("The word was " + studentName.toUpperCase());
		}
	}

}
