package libraryBookIssuing;

import java.util.Scanner;

public class BookKeeping {
	Scanner sc = new Scanner(System.in);
	String selectedUser;

	void registeredUserCheck(Users[] bookUsers) {

		System.out.println("Enter the name of user(Ravi/Manu/Kevin) : ");
		selectedUser = sc.next();
		boolean userFound = false;
		for (int i = 0; i < bookUsers.length; i++) {
			if (selectedUser.equalsIgnoreCase(bookUsers[i].nameOfUsers)) {
				System.out.println("Welcome registered User");
				userFound = true;
				break;
			}
		}
		if (!userFound) {
			System.out.println("User not registered,please register in any of the library");
		}
	}

	void chooseLibraryAndIssueBooks(Library[] allLibraries) {
		System.out.println("From which library you would like to issue the book(Central_Library/Community_Library)");
		String selectedLibraryName = sc.next();
	    Library.libraryName selectedLibraryEnum = Library.libraryName.valueOf(selectedLibraryName.toUpperCase());

	    for (int i = 0; i < allLibraries.length; i++) {
	        if (selectedLibraryEnum == allLibraries[i].nameOfLibrary) {
	            System.out.println("Books are available in " + selectedLibraryName);
	            System.out.println("Available Books");

	            for (int j = 0; j < allLibraries[i].books.length; j++) {
	                System.out.println(allLibraries[i].books[j].bookName);
	            }

				int cnt = 0;

				while (cnt < 2) {
					System.out.println("Enter the name of the book that you want to be issued");
					String bookName = sc.next();
					boolean bookFound = false;

					for (int j = 0; j < allLibraries[i].books.length; j++) {
						if (allLibraries[i].books[j].bookName.equals(bookName)
								&& !allLibraries[i].books[j].isBookIssued) {
							allLibraries[i].books[j].isBookIssued = true;
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
					if (needMoreBooks.equalsIgnoreCase("no")) {
						System.out.println(selectedUser + " is issued with books " + bookName);
						break;
					}
				}

				sc.close();
			}
		}
	}

}
