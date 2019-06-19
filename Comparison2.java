package chapter4.exercise416;

import java.util.Scanner;

public class Comparison2 {
	public String checkLargestTwo() {
		
		int counter = 1;
		int number;
		int largestNumber = 0;
		int secondLargest = 0;
		
			Scanner input = new Scanner(System.in);
			
		
			while(counter <= 10 ){
			System.out.print("Enter Number: ");
			 number = input.nextInt();
			 
			 if (number > largestNumber) {
				 secondLargest = largestNumber;
				 largestNumber = number;
			 }
			 else {
				 	if (number > secondLargest) {
				 		secondLargest = number;
				 		}	
			 	}
			 counter++;
			
			 
		
			}
			String result ="Largest Number is: " + largestNumber+ "\n" + "Second Largest Number is: " + secondLargest;
			return result;
	}
}