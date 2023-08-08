package libraryBookIssuing;

import libraryBookIssuing.Books.BookGenres;

public class LibraryMain {

	public static void main(String[] args) {

		BookKeeping bk = new BookKeeping();

		Users[] bookUsers = LibraryData.initializeUsers();
		Books[] booksInLibrary = LibraryData.initializeBooks();

		bk.registeredUserCheck(bookUsers);
		bk.chooseGener(booksInLibrary);
		bk.issueBook(booksInLibrary);
	}

}
