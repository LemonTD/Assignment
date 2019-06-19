package chapter4.exercise416;

import java.util.Scanner;

public class Cryptography {
	
	public void showEncrypted() {
		
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 1;
		int remainder =0;
		int reversed = 0;
		int a = 0, b = 0, c = 0, d = 0;
		
		
		
		System.out.println("Enter Number to encrypt: ");
		 number = input.nextInt();
		
		 while(counter <= 4)
			{	
				 
					remainder = number % 10;
						if (counter ==1 ) {
							a = (remainder + 7) % 10;
						}
						else if (counter == 2) {
							b = (remainder +7) % 10;
						}
						else if (counter == 3) {
							c = (remainder + 7) % 10;
						}
						else if (counter == 4) {
							d = (remainder + 7) % 10;
						}
						else {
							
						}
				
				counter++;
				
				 number = number / 10;
				
			}
		 
		 System.out.println("Encrypted digit is: " + b+a+d+c); // result is printed with first firstnumber replacing 3rd and 2nd replacing 4th
			
	}
	

}
