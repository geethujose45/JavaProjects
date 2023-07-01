package learnOperations;

public class assignmentOperators {
	int age=25;
	
	void ageAfter5Years() {
		age+=5;
		System.out.println("Age after 5 years = " +age);
	}
	void minusEqualTo() {
		age-=10;
		System.out.println("Age before 10 years = " +age);
	}
	void divideEqualTo() {
		age/=2; 
		System.out.println("Age divided by 2 is " +age);
	}
	void modularEqualTo() {
		age%=3;
		System.out.println("Modular is" +age);
	}
	void multipleEqualTo() {
		System.out.println("Age multipleid is " +age);
	}
}
