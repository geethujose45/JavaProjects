package libraryBookIssuing;

import libraryBookIssuing.Books.BookGenres;


public class LibraryMain {

	public static void main(String[] args) {

		Users user1 = new Users("Ravi", 76545, null);
		Users user2 = new Users("Manu", 76545, null);
		Users user3 = new Users("Kevin", 76545, null);

		Users[] bookUsers = { user1, user2, user3 };

		Books book1 = new Books("F. Scott Fitzgerald", "The Great Gatsby", false, BookGenres.FICTION);
		Books book2 = new Books("George Orwell", "Nineteen Eighty-Four", false, BookGenres.FICTION);
		Books book3 = new Books("Paulo Coelho", "The Alchemist", false, BookGenres.FICTION);
		Books book4 = new Books("J. D. Salinger", "The Catcher in the Rye", false, BookGenres.FICTION);
		Books book5 = new Books("Jane Austen", "Pride and Prejudice", false, BookGenres.FICTION);

		Books book6 = new Books("N. K. Jemisin", "The Fifth Season", false, BookGenres.FANTASY);
		Books book7 = new Books("Peter S. Beagle", "The Last Unicorn", false, BookGenres.FANTASY);
		Books book8 = new Books("Leigh Bardugo", "Six of Crows", false, BookGenres.FANTASY);
		Books book9 = new Books("Ursula K. Le Guin", "A Wizard of Earthsea", false, BookGenres.FANTASY);
		Books book10 = new Books("Neil Gaiman", "American Gods", false, BookGenres.FANTASY);

		Books book11 = new Books("Agatha Christie", "And Then There Were None", false, BookGenres.MYSTERY);
		Books book12 = new Books("Raymond Chandler", "The Big Sleep", false, BookGenres.MYSTERY);
		Books book13 = new Books("Gillian Flynn", "Gone Girl", false, BookGenres.MYSTERY);
		Books book14 = new Books("Truman Capote", "In Cold Blood", false, BookGenres.MYSTERY);
		Books book15 = new Books("Wilkie Collins", "Woman in White", false, BookGenres.MYSTERY);

		Books book16 = new Books("Truman Capote", "In Cold Blood", false, BookGenres.NARRATIVE);
		Books book17 = new Books("John Carreyrou", "Bad Blood", false, BookGenres.NARRATIVE);
		Books book18 = new Books("Jon Krakauer", "Into Thin Air", false, BookGenres.NARRATIVE);

		Books book19 = new Books("Hanya Yanagihara", "A Little Life", false, BookGenres.NOVEL);
		Books book20 = new Books("Toni Morrison", "Beloved", false, BookGenres.NOVEL);

		Books[] booksInLibrary = { book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11,
				book12, book13, book14, book15, book16, book17, book18, book19, book20 };

		BookKeeping bk = new BookKeeping();

		bk.registeredUserCheck(bookUsers);
		bk.chooseGener(booksInLibrary);
		bk.issueBook(booksInLibrary);
	}

}
