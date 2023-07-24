package libraryBookIssuing;

public class Books {

	boolean isBookIssued;
	String bookName;
	String nameOfAuthor;

	Books(String nameAuthor, String nameBook, boolean isIssued) {

		bookName = nameBook;
		nameOfAuthor = nameAuthor;
		isBookIssued = isIssued;

	}

}
