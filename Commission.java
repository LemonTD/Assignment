package chapter4.exercise416;

import java.util.Scanner;

public class Commission {
	
	public double calculateCommission() {
		int counter = 0;
		int wages;
		double total = 0;
		double commission = 0;
		String salesPerson;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Salesperson Name: ");
			salesPerson = input.nextLine() ;
		
		System.out.println("Enter wages: ");
			wages = input.nextInt();
		
		System.out.println("Enter Number of itemsSold: ");
			int itemsSold = input.nextInt();
	
			while (counter < itemsSold) {
		
				System.out.println("Enter item value: ");
				int itemValue = input.nextInt();
				if (itemValue == -1) {
					break;
				}
				
			total += itemValue;
			counter ++;
			
			}
			
			commission = total * 0.09;
			System.out.println (salesPerson + " " + "Commission for itemsSold is: " + commission);
			
			double earnings = wages + commission;
			
			return earnings;
			
	}
}