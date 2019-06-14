package chapter5.exercise5_12;

//import java.util.Scanner;

public class OddNumber {
		public void getOddNumber() {
			int number;
			int odd = 1;
			int oddProduct = 1;
			
//			Scanner scan = new Scanner(System.in);
//			
			
//			System.out.println("Enter Number from 1 - 15:");
//			number = scan.nextInt();
//			
			
			
			for (int i = 1; i <= 15; i++) {
				if(i % 2 != 0) {
					odd = i;
					oddProduct = oddProduct * i;
					
					System.out.println("Odd Number is: " + odd);
					System.out.println("Product of Odd Numbers: " + oddProduct);
				}
				
				
			}
		}
}