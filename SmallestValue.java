package chapter5.exercises5_11;

import java.util.Scanner;

public class SmallestValue {
		
	public void getSmallestValue() {
		
		int smallest;
		int number;
		int numb;
		int numb1 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Number of Integers to check: ");
		number = scan.nextInt();
		
		System.out.println("Enter Integers: ");
			 numb = scan.nextInt();
			 smallest = numb;	
		
			for (int i = 1; i < number; i++) {
			numb = scan.nextInt();
			
			
			if (numb < smallest) {
				smallest = numb;
				}
			
			}
			System.out.println("Smallest Number is: " + smallest);
			scan.close();
	}

	
}
