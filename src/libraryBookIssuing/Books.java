package libraryBookIssuing;

public class Books {

	boolean isBookIssued;
	String bookName;
	String nameOfAuthor;
	BookGenres genresOfBook;

	public Books(String nameAuthor, String nameBook, boolean isIssued, BookGenres genres) {

		nameOfAuthor = nameAuthor;
		bookName = nameBook;
		isBookIssued = isIssued;
		genresOfBook = genres;

	}

	enum BookGenres {

		FICTION("Fiction"), 
		NARRATIVE("Narrative"), 
		MYSTERY("Mystery"), 
		NOVEL("Novel"), 
		FANTASY("Fantasy");

		String genresOfBook;

		private BookGenres(String genres) {
			genresOfBook = genres;
		}

		String getgenresOfBook() {
			return genresOfBook;
		}
	}

	public BookGenres genresOfBook() {
		return genresOfBook;
	}
}
