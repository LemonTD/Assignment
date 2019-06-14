package chapter5.exercise5_18;

import java.util.Scanner;

public class Compound3 {
	
	public void getInterest() {
		// TODO Auto-generated method stub
			
		Scanner scan = new Scanner(System.in);
		
		double result = 0;


		double total = 1;
		
		System.out.println("Enter Principal: ");
		int principal = scan.nextInt();
		
		System.out.println("Enter Number of years: ");
		int numberOfYears = scan.nextInt();
		
		System.out.println("Enter rate: ");
		double rate = scan.nextDouble()/100;
		
	
		total = principal * 100;
		
		for(double c= 1; c <= numberOfYears; c++) {				
						
			 result = total * Math.pow((1+rate), c);
			 
			 int cent = (int) result % 100;
			 
			 int dollar = (int) result /100;
			 
			 System.out.printf("%s%d%s%d%s%n", "$", dollar, " ", cent, "cent");
//			 System.out.println();
			 
				}
		
			}
	public static void main(String[] args) {
		Compound3 lem = new Compound3();
		
		lem.getInterest();
	}
}