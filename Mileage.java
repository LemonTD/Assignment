package chapter4.exercise416;

import java.util.Scanner;

public class Mileage {
	public double calculateMileage() {
		Scanner input = new Scanner(System.in);
		
		int miles = 0;
		int gallon = 0;
		double milesPerGallon = 0;
		double total = 0;
		double average;
		int counter = 0;
		
		System.out.println("Enter number of trips");
		int trip = input.nextInt();
		
		while (counter <= trip) {
			
			
			System.out.println("Enter miles: ");
			miles = input.nextInt();
				if (miles == -1) {
					break;
				}
			
			System.out.println("Enter gallon: ");
			gallon = input.nextInt();
				if(gallon == -1) {
					break;
				}
			
			milesPerGallon = miles/gallon;
			System.out.println("trip " + " = " + milesPerGallon);
			total = total + milesPerGallon;
			counter ++;
			
		}
		
		average = total/counter;
		return average;
		
	}
}
