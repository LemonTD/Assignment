package chapter4.exercise416;

import java.util.Scanner;

public class Triangle {
	
	public void showTriangle( ) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Non-Zero Number: ");
	int  numb = scan.nextInt();
	 
	 System.out.println("Enter Non-Zero Number: ");
	int numb1 = scan.nextInt();
	 
	 System.out.println("Enter Non-Zero Number: ");
	 int numb2 = scan.nextInt();
	 
	
	int result = 0;
	
	
	if (result < 180) {

		
		result =numb + numb1 + numb2;
		System.out.println(result);
		System.out.println( result != 180 ? "Can be used for Triangle" : "N0!!! cannot be used for Triangle");	

		}
	
	}

}