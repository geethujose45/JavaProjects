package learnOperations;

public class arithemeticOperations {
	int x;
	int y;
	
	void addTwoNumbers() {
		int sum = x+y;
		System.out.println("Addition of two number " +x+ " and " +y+ " Is " +sum);
		
	}
	void substactTwoNumber()
	{
		int sub=x-y;
		System.out.println("Subtracted value =" +sub);
	}
	void multipleTwoNumbers() {
		int mul=x*y;
		System.out.println("The product of " +x+ " and " +y+ " is " +mul);
	}
	void divideTwoNumbers() {
		double quotient=x/y;
		int reminder=x%y;
		System.out.println("The quotient of " +x+ " and " +y+ " is " +quotient);
		System.out.println("The Reminder of " +x+ " and " +y+ " is " +reminder);
	}
	
}
