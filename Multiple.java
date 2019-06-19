package chapter4.exercise416;

import java.util.Scanner;

public class Multiple {
		private int number;
			public Multiple(int number) {
				this.number = number;
			}
				public int getNumber() {
					return number;
				}
				public void setNumber(int number) {
					this.number = number;
				}
				
		public void showMultiple (){
			Scanner ops = new Scanner(System.in);
		
				
				int count = 0;
				int lee = 1;
				int result = 0;
				
				
				while (lee >= 0) {
					
					 lee *= number;
					 result = lee;
					 
					 System.out.println(result);
					 count++;
					
				}
					
		}
		

}
