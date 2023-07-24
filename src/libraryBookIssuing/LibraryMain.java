package libraryBookIssuing;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {

		Users user1 = new Users("Ravi", 76545, null);
		Users user2 = new Users("Manu", 76545, null);
		Users user3 = new Users("Kevin", 76545, null);

		Users[] bookUsers = { user1, user2, user3 };

		Books communityBook1 = new Books("George_Orwell", "Animal_Farm", false);
		Books communityBook2 = new Books("Harper_Lee", "To_Kill_a_Mockingbird", false);
		Books communityBook3 = new Books("George_Orwell", "Brave_New_World", false);
		Books communityBook4 = new Books("Ray_Bradbury", "Fahrenheit_451", false);
		Books communityBook5 = new Books("Cormac_McCarthy", "Cormac_McCarthyThe_Road", false);
		Books communityBook6 = new Books("Khaled_Hosseini", "The_Kite_Runner", false);

		Books[] booksCommunityInLibrary = { communityBook1, communityBook2, communityBook3, communityBook4,
				communityBook5, communityBook6 };

		Library library1 = new Library("Community_Library", 6, booksCommunityInLibrary);

		Books centralBook1 = new Books("Andy_Blyton", "On_an_Island", false);
		Books centralBook2 = new Books("JK_Rowling", "Goblet_of_fire", false);
		Books centralBook3 = new Books("Chetan_Bhagat", "Five_Point_Someone", false);
		Books centralBook4 = new Books("R_Martin", "Ice_and_Fire", false);
		Books centralBook5 = new Books("Cormac_McCarthy", "The_Road", false);
		Books centralBook6 = new Books("Khaled_Hosseini", "Lord_of_the_Rings", false);

		Books[] booksInCentralLibrary = { centralBook1, centralBook2, centralBook3, centralBook4, centralBook5,
				centralBook6 };

		Library library2 = new Library("Central_Library", 6, booksInCentralLibrary);

		Library[] allLibraries = { library1, library2 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of user(Ravi/Manu/Kevin) : ");
		String selectedUser = sc.next();

		boolean userFound = false;
		for (int i = 0; i < bookUsers.length; i++) {
			if (selectedUser.equals(bookUsers[i].nameOfUsers)) {
				System.out.println("Welcome registered User");
				userFound = true;
				break;
			}
		}
		if (!userFound) {
			System.out.println("User not registered,please register in any of the library");
		} else {
			System.out
					.println("From which library you would like to issue the book(Central_Library/Community_Library)");
			String selectedLibrary = sc.next();
			for (int i = 0; i < allLibraries.length; i++) {
				if (selectedLibrary.equals(allLibraries[i].nameOfLibrary)) {
					System.out.println("Books are available in " + selectedLibrary);
					System.out.println("Available Books");

					for (int j = 0; j < allLibraries[i].books.length; j++) {
						{
							System.out.println(allLibraries[i].books[j].bookName);
						}
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
							System.out.println(selectedUser + " is issued with books " +bookName);
							break;
						}
					}

					sc.close();
				}
			}
		}

	}
}
