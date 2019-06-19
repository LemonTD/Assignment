package chapter4.exercise416;
import java.util.Scanner;
public class Demo2 {
//	public static void main(String[] args) {
//		int y = 7;
//		int x = 5;
//		
//		if (y == 8) {
//			if (x == 5) {
//				System.out.println("@@@@@");
//			}
//		}
//			else {
//				System.out.println("#####");
//				System.out.println("$$$$$");
//				System.out.println("&&&&&");
//			
//		}
//	}
	
	public static void main(String[] args) {

		Scanner ops = new Scanner(System.in);
		
		System.out.print("Enter Square Size(hint: 1-20): ");
		int squareSize = ops.nextInt();
		
		
		int row = 1;
		
		while (row >=1) {
			int top = 1;
			int chin = squareSize;
			while (top <=chin) {
			System.out.print ("*");
			++top;
		}
			
			
	}
		--row;
}
}