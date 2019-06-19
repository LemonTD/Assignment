package chapter4.exercise416;

public class CreditLimitTest {
 
		public static void main(String[] args) {
				CreditLimit  lem = new CreditLimit(500.65, 4000);
				
				
				System.out.println(lem.calculateNewBalance());
		}
}