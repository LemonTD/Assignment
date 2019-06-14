package chapter5.exercise5_14;

import java.util.Scanner;

public class Compound2 {
	
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
		
		
//		double b = rate / 100;
	//double a= 1 + rate;	
		//int i;
//		int c /= 100;
		
		
		for(double c= 0.05; c <= rate; c+=0.01) {				
			
			for(int i = 1; i <=numberOfYears; i++ ) {
			
			 total *= (1 + c);
			 
			 
			 result = principal * total;
				System.out.printf("%s%d%s%s%.2f%n", "Compound interest for ",  i , "years", ":	", result);
				if(i == numberOfYears) {
					total=1;
				}
			}
				System.out.println();
				
			
			}		
	}

}
