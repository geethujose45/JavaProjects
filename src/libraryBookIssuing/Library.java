package libraryBookIssuing;
public class Library {

    public enum libraryName {
        CENTRAL_LIBRARY("Central_Library"),
        COMMUNITY_LIBRARY("Community_Library");

        private String nameOfLibrary;

        libraryName(String libraryName) {
            this.nameOfLibrary = libraryName;
        }

        public String getNameOfLibrary() {
            return nameOfLibrary;
        }
    }

    libraryName nameOfLibrary; //enum
    int totalBooks;
    Books[] books;

    public Library(libraryName libraryName, int tBooks, Books[] booksInLibrary) {
        this.nameOfLibrary = libraryName;
        totalBooks = tBooks;
        books = booksInLibrary;
    }

    public libraryName getNameOfLibrary() {
        return nameOfLibrary;
    }
}