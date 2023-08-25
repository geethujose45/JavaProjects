package curiseAssignment;

public class User {
	private String userName;
	private String password;
	private String name;
	private int phoneNumber;
	
	public User(String username,String password,String name,int phoneNumber) {
		this.setUserName(username);
		this.setPassword(password);
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int newPhoneNumber) {
		this.phoneNumber = newPhoneNumber;
	}

}
