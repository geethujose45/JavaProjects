package userLoginAssignment;

public class MainUserLoginClass {

	public static void main(String[] args) {
		UserLoginClass userlogin = new UserLoginClass();

		userlogin.userName = "pivotAdmin";
		userlogin.password = "Admin123";
		userlogin.attempt = 0;

		userlogin.loginUser();

	}

}
