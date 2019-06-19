package chapter4.exercise416;


public class CheckerBoard {
	public static void main(String[] args) {
		
		
		int counter = 0;
		
		while(counter < 4) {
			int row = 1;
			while(row >= 8) {
			
				System.out.print("* ");
				row++;
			}
			
			System.out.print(" ");
			System.out.println();
			
			int column = 1;
			while(column >= 8) {
				
				System.out.print("* ");
				row++;
			}
			
			counter++;
			
		}
	}
}
