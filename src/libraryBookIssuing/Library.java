package libraryBookIssuing;


public class Library {

	String nameOfLibrary;
	int totalBooks;
	Books[] books;

	public Library(String libraryName, int tBooks, Books[] booksInLibrary) {
		nameOfLibrary = libraryName;
		totalBooks = tBooks;
		books = booksInLibrary;
	}
}
