package chapter5.exercise5_20;

public class PiValue {
	
	public void getValue() {
		double c = -4;
		double p = 0;
		int counter = 1;
		
		for (int i = 1; i <= 130658; i++) {
			c = c * -1;
			p +=  (c/counter);
			
			System.out.printf("%.5f%n",p);
			counter +=2;
		}
	}
	public static void main(String[] args) {
		PiValue lem = new PiValue();
		
		lem.getValue();
	}
}
