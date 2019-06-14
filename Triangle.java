package chapter5.exercise5_15;

public class Triangle {
	
	public void getTriangle() {
		
		for (int i = 1; i <=10; i++) {			
			for(int j =1; j<=i; j++) {
				System.out.print("*");
				
			}			
			System.out.println();
		}
			System.out.print("\n\n");
			
		for (int l =10; l>=1; l--) {
			for(int n =l; n>=1; n-- ) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
			System.out.print("\n\n");
		
		for (int l =10; l>=1; l--) {
			for(int n =1; n<=l; n++) {
				System.out.print("*");			
		
				if(n == l) {
		
					System.out.println();		
					for(int j=n-9; j<=1; j++) {				
						System.out.print(" ");
					}
				}
			}
		}	
				System.out.println();
				System.out.print("\n");
		
		for (int l =1; l<=10; l++) {
			for(int n =l; n>=1; n--) {
				System.out.print("*");			
		
			 	if(n == l) {
		
					System.out.println();		
					for(int	 j=n-8; j<=1; j++) {				
						System.out.print(" ");
					}
				}
			}
		}
	}
		
	
	public static void main(String[] args) {
		Triangle lem = new Triangle();
		
		lem.getTriangle();
	}
}
