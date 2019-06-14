package chapter5.exercise5_16;

import java.util.Scanner;

public class BarChart {
	
	public void getBarChart(int number) {
		Scanner pim = new Scanner(System.in);		
		
		int i =1;
					
			if(number >= 1 && number <= 30) {	
				do {
					System.out.print("*");
					
					i++;
					}
				
				while(i<=number);
				System.out.println();
			}	
			
	}
}
