package libraryBookIssuing;

import libraryBookIssuing.Books.BookGenres;

public class LibraryData {

	public static Users[] initializeUsers() {

		Users[] bookUsers = new Users[3];
		bookUsers[0] = new Users("Ravi", 76545, null);
		bookUsers[1] = new Users("Manu", 76546, null);
		bookUsers[2] = new Users("Kevin", 76547, null);
		return bookUsers;
	}

	public static Books[] initializeBooks() {

		Books[] booksInLibrary = new Books[20];

		booksInLibrary[0] = new Books("F. Scott Fitzgerald", "The Great Gatsby", false, BookGenres.FICTION);
		booksInLibrary[1] = new Books("George Orwell", "Nineteen Eighty-Four", false, BookGenres.FICTION);
		booksInLibrary[2] = new Books("Paulo Coelho", "The Alchemist", false, BookGenres.FICTION);
		booksInLibrary[3] = new Books("J. D. Salinger", "The Catcher in the Rye", false, BookGenres.FICTION);
		booksInLibrary[4] = new Books("Jane Austen", "Pride and Prejudice", false, BookGenres.FICTION);

		booksInLibrary[5] = new Books("N. K. Jemisin", "The Fifth Season", false, BookGenres.FANTASY);
		booksInLibrary[6] = new Books("Peter S. Beagle", "The Last Unicorn", false, BookGenres.FANTASY);
		booksInLibrary[7] = new Books("Leigh Bardugo", "Six of Crows", false, BookGenres.FANTASY);
		booksInLibrary[8] = new Books("Ursula K. Le Guin", "A Wizard of Earthsea", false, BookGenres.FANTASY);
		booksInLibrary[9] = new Books("Neil Gaiman", "American Gods", false, BookGenres.FANTASY);

		booksInLibrary[10] = new Books("Agatha Christie", "And Then There Were None", false, BookGenres.MYSTERY);
		booksInLibrary[11] = new Books("Raymond Chandler", "The Big Sleep", false, BookGenres.MYSTERY);
		booksInLibrary[12] = new Books("Gillian Flynn", "Gone Girl", false, BookGenres.MYSTERY);
		booksInLibrary[13] = new Books("Truman Capote", "In Cold Blood", false, BookGenres.MYSTERY);
		booksInLibrary[14] = new Books("Wilkie Collins", "Woman in White", false, BookGenres.MYSTERY);

		booksInLibrary[15] = new Books("Truman Capote", "In Cold Blood", false, BookGenres.NARRATIVE);
		booksInLibrary[16] = new Books("John Carreyrou", "Bad Blood", false, BookGenres.NARRATIVE);
		booksInLibrary[17] = new Books("Jon Krakauer", "Into Thin Air", false, BookGenres.NARRATIVE);

		booksInLibrary[18] = new Books("Hanya Yanagihara", "A Little Life", false, BookGenres.NOVEL);
		booksInLibrary[19] = new Books("Toni Morrison", "Beloved", false, BookGenres.NOVEL);
		return booksInLibrary;

	}
}
