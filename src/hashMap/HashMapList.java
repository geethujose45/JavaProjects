package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import curiseAssignment.User;

public class HashMapList {

	public static void main(String[] args) {

		User aman = new User("Aman", "aman@123", "Aman", "1234567890");
		User geethu = new User("Geethu", "geethu@456", "Geethu Jose", "9876543210");
		User surya = new User("Surya", "surya789", "Surya Prakash", "8765432109");
		User anju = new User("Anju", "anju321", "Anju", "7654321098");

		List<User> listOfUsers = new ArrayList<>();
		listOfUsers.add(aman);
		listOfUsers.add(geethu);
		listOfUsers.add(surya);
		listOfUsers.add(anju);

		HashMap<String, User> userMap = new HashMap<>();
		HashMap<String, List<User>> userMap1 = new HashMap<>();
		userMap1.put("allUsers", listOfUsers);

		List<User> getUsers = userMap1.get("allUsers");
		if (getUsers != null) {
			for (User user : getUsers) {
				System.out.println("Username: " + user.getUserName());
			}
		}
	}
}