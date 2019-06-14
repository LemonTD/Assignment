package chapter5.exercise5_21;

public class Pythagorean {

	public void getGorean() {
		
		for(int a = 1; a <10; a++) {
			for(int b =1; b < 10; b++) {
				for(int c = 1; c< 10; c++) {
					if ((a *a) + (b*b) == (c * c)) {
						System.out.println(a +" "+ b +" "+ c);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Pythagorean lem = new Pythagorean();
		
		lem.getGorean();
	}
}
