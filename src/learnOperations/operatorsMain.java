package learnOperations;

public class operatorsMain {

	public static void main(String[] args) {
		arithemeticOperations ao = new arithemeticOperations();
	
	
		//Assigning the values 
		ao.x=20;
		ao.y=10;
		//invoking the method
		ao.addTwoNumbers();
		
		//Reassigning the values 
		ao.x=80;
		ao.y=19;
		//invoking the method
		ao.addTwoNumbers();
		
		ao.substactTwoNumber();
		
		ao.multipleTwoNumbers();
		
		ao.divideTwoNumbers();
		
		
		assignmentOperators ao1 = new assignmentOperators();
		ao1.ageAfter5Years();
		ao1.minusEqualTo();
		ao1.divideEqualTo();
		ao1.modularEqualTo();
		ao1.multipleEqualTo();
	}

}
