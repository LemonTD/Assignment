package chapter4.exercise416;

import java.util.Scanner;

public class CreditLimit {
	double initialBalance;
	int creditLimit;
	double newBalance;
	
	
	public CreditLimit(double initialBalance, int creditLimit) {
		this.initialBalance = initialBalance;
		this.creditLimit = creditLimit;
	}
	
	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public double calculateNewBalance() {
		Scanner input = new Scanner(System.in);
		
			
		 System.out.println("Enter Account Number: ");
		 int accountNumber = input.nextInt();
		 
		 System.out.println("Enter credit total");
		 int creditTotal = input.nextInt();
		 
		 System.out.println("Enter Total charges: ");
		 int totalCharges = input.nextInt();
		

		 
		
		
		 if (newBalance > creditLimit) {
			 System.out.println("Credit Limit Exceeded");
		 }
		 else {
			 newBalance = initialBalance + totalCharges - creditTotal;
		}

		return newBalance;
	}
}