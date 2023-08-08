package libraryBookIssuing;

import java.util.Scanner;

import libraryBookIssuing.Books.BookGenres;

public class BookKeeping {
	Scanner sc = new Scanner(System.in);
	private String selectedUser;
	private String selectedGener;
	private String text = "Welcome %s to %s library";

	public boolean registeredUserCheck(Users[] bookUsers) {
		System.out.println("Enter the name of user(Ravi/Manu/Kevin) : ");
		selectedUser = sc.nextLine();
		for (Users users : bookUsers) {
			if (selectedUser.equalsIgnoreCase(users.nameOfUsers)) {
				String formattedText = String.format(text, "registered user", "Toronto");
				System.out.println(formattedText);
				return true;
			}
		}
		System.out.println("User not registered,please register in the library");
		return false;
	}

	public boolean chooseGener(Books[] booksInLibrary) {
		System.out.println(
				"Which gener of book you are look for? \n FICTION \n NARRATIVE \n MYSTERY \n NOVEL \n FANTASY");
		selectedGener = sc.nextLine().toUpperCase();

		boolean isValidGenre = false;
		Books.BookGenres[] allGenres = Books.BookGenres.values();
		for (BookGenres bookGenres : allGenres) {
			if (selectedGener.equals(bookGenres.name())) {
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
			return foundBooksInGenre;
		} else {
			System.out.println("Invalid Input");
			return false;
		}
	}

	void issueBook(Books[] booksInLibrary) {

		int cnt = 0;
		while (cnt < 2) {
			System.out.println("Enter the name of the book that you want to be issued");
			String bookName = sc.nextLine();
			boolean bookFound = false;
			for (Books books : booksInLibrary) {
				if (books.bookName.equals(bookName) && books.genresOfBook.name().equals(selectedGener)
						&& !books.isBookIssued) {
					books.isBookIssued = true;
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
			} else {
				chooseGener(booksInLibrary);
			}
		}
		// System.out.println("Thankyou for visiting Us");
		sc.close();
	}

	public String getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(String selectedUser) {
		this.selectedUser = selectedUser;
	}

	public String getSelectedGener() {
		return selectedGener;
	}

	public void setSelectedGener(String selectedGener) {
		this.selectedGener = selectedGener;
	}
}
