package ConditionalStatement;

public class Account {

	double balanceAmount;

	int witdrawAmount;

	int overdraftAmount;

	int pinNumber;

	int enteredPin;

	void atmWithdrawal() {
		if (balanceAmount >= witdrawAmount || overdraftAmount >= witdrawAmount) {
			System.out.println("Customer can withdraw the amount");
		} else {
			System.out.println("You dont have sufficent balance");
		}
	}

	void validatePINAndwithdrawCash() {
	    if (pinNumber == enteredPin) {
	        System.out.println("You have entered the correct Pin Number");
	        if (balanceAmount >= witdrawAmount || overdraftAmount >= witdrawAmount) {
	            System.out.println("Customer can withdraw the amount");
	        } else {
	            System.out.println("You don't have sufficient balance");
	        }
	    } else {
	        System.out.println("PIN is incorrect");
	    }
	}
}