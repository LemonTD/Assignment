package chapter4.exercise416;

import java.util.Scanner;


public class Employee {
	
	public void calculateSalary() { 
		String employeeName;
		int hoursWorked;
		double hourlyRate;
		double grossPay = 0;
		double excessHour = 0;
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter EmployeeName: ");
			employeeName = input.nextLine();
			
		System.out.println("Enter hoursWorked: ");
			hoursWorked = input.nextInt();
			
		
		System.out.println("Enter hourlyRate: ");
			hourlyRate = input.nextInt();
		
			
		excessHour = hoursWorked - 40;	
		double b = excessHour / 2;
		
		
		if (hoursWorked <= 40) {
			grossPay = hoursWorked * hourlyRate;
			
			System.out.println(employeeName + " grossPay is: " + grossPay );
		}
		else if (hoursWorked > 40) {
			grossPay = hourlyRate * (excessHour + b + 40);
		}
		
		
		System.out.println(employeeName + " grossPay is: " + grossPay );
	}
}
