package libraryBookIssuing;

import libraryBookIssuing.Library.libraryName;

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

		Books[] booksCommunityInLibrary ={ communityBook1, communityBook2, communityBook3, communityBook4,
			communityBook5, communityBook6 };
		
		Library library1 = new Library(libraryName.COMMUNITY_LIBRARY, 6, booksCommunityInLibrary);

		Books centralBook1 = new Books("Andy_Blyton", "On_an_Island", false);
		Books centralBook2 = new Books("JK_Rowling", "Goblet_of_fire", false);
		Books centralBook3 = new Books("Chetan_Bhagat", "Five_Point_Someone", false);
		Books centralBook4 = new Books("R_Martin", "Ice_and_Fire", false);
		Books centralBook5 = new Books("Cormac_McCarthy", "The_Road", false);
		Books centralBook6 = new Books("Khaled_Hosseini", "Lord_of_the_Rings", false);

		Books[] booksInCentralLibrary = { centralBook1, centralBook2, centralBook3, centralBook4, centralBook5,
				centralBook6 };

		Library library2 = new Library(libraryName.CENTRAL_LIBRARY, 6, booksInCentralLibrary);

		Library[] allLibraries = { library1, library2 };

		BookKeeping bk = new BookKeeping();

		bk.registeredUserCheck(bookUsers);
		bk.chooseLibraryAndIssueBooks(allLibraries);
	}

}
