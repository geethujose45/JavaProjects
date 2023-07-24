package libraryBookIssuing;

import libraryBookIssuing.Users;

public class Users {

	String nameOfUsers;
	int userId;
	Books[] books;

	public Users(String usersName, int idOfUser, Books[] bBooks) {
		nameOfUsers = usersName;
		userId = idOfUser;
		books = bBooks;

	}
}
