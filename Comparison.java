package chapter4.exercise416;

import java.util.Scanner;

public class Comparison {
	
	public int checkLargestNumber() {
	
	int counter = 1;
	int number;
	int largestNumber = 0;
	
		Scanner input = new Scanner(System.in);
		
	
		while(counter <= 10 ){
		System.out.print("Enter Number: ");
		 number = input.nextInt();
		 
		 if (number > largestNumber) {
			 largestNumber = number;
		 }
		 counter++;
		 }	
	return largestNumber;
	}
}