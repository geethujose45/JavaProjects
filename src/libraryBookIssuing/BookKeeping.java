package libraryBookIssuing;

import java.util.Scanner;

public class BookKeeping {
	Scanner sc = new Scanner(System.in);
	String selectedUser;
	String selectedGener;
	String text="Welcome %s to %s library";

	void registeredUserCheck(Users[] bookUsers) {

		System.out.println("Enter the name of user(Ravi/Manu/Kevin) : ");
		selectedUser = sc.nextLine();
		boolean userFound = false;
		for (int i = 0; i < bookUsers.length; i++) {
			if (selectedUser.equalsIgnoreCase(bookUsers[i].nameOfUsers)) {
				String formattedText=String.format(text,"registered user","Toronto");
				System.out.println(formattedText);
				userFound = true;
				break;
			}
		}
		if (!userFound) {
			System.out.println("User not registered,please register in the library");
			System.exit(0);
		}
	}

	void chooseGener(Books[] booksInLibrary) {
		System.out.println("Which gener of book you are look for?(FICTION/NARRATIVE/MYSTERY/NOVEL/FANTASY)");
		selectedGener = sc.nextLine().toUpperCase();

		boolean isValidGenre = false;
		Books.BookGenres[] allGenres = Books.BookGenres.values();

		for (int i = 0; i < allGenres.length; i++) {
			if (selectedGener.equals(allGenres[i].name())) {
				isValidGenre = true;
				break;
			}
		}
		if (isValidGenre) {
			System.out.println("Books are available in " + selectedGener);
			System.out.println("Available Books");

			boolean foundBooksInGenre = false;

			for (int i = 0; i < booksInLibrary.length; i++) {
				if (booksInLibrary[i].genresOfBook.name().equals(selectedGener)) {
					System.out.println(booksInLibrary[i].bookName);
					foundBooksInGenre = true;
				}
			}
			if (!foundBooksInGenre) {
				System.out.println("Books not available");
			}
		} else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}

	void issueBook(Books[] booksInLibrary) {

		int cnt = 0;
		while (cnt < 2) {
			System.out.println("Enter the name of the book that you want to be issued");
			String bookName = sc.nextLine();
			boolean bookFound = false;

			for (int i = 0; i < booksInLibrary.length; i++) {
				if (booksInLibrary[i].bookName.equals(bookName) && booksInLibrary[i].genresOfBook.name().equals(selectedGener)&&!booksInLibrary[i].isBookIssued) {
					booksInLibrary[i].isBookIssued = true;
					cnt++;
					bookFound = true;
					break;
				}
			}

			if (!bookFound) {
				System.out.println("Book not found or already issued. Please enter a valid book name.");
			}

			if (cnt >= 2) {
				System.out.println("You have issued 2 books.Reached maximum book count to be issues.");
				break;
			}

			System.out.println("Do you want to issue more books? (yes/no)");
			String needMoreBooks = sc.next();
			sc.nextLine();
			if (needMoreBooks.equalsIgnoreCase("no")) {
				System.out.println("Thankyou for visiting Us");
				break;
			}
		}

		sc.close();
	}
}
