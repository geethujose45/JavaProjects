package ConditionalStatement;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);
		ac.balanceAmount=7850.45;
		//ac.witdrawAmount=10000;
		ac.overdraftAmount=8000;
		System.out.println("Enter the pin:");
		ac.enteredPin=sc.nextInt();
		System.out.println("Enter the amount to withdraw");
		ac.witdrawAmount=sc.nextInt();
		ac.validatePINAndwithdrawCash();
		ac.atmWithdrawal();
		sc.close();

	}

}
