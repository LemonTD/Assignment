package chapter4.exercise416;

public class Tabular {
	
	public static void main(String[] args) {
	
	System.out.println("N\t 10*N\t100*N\t1000*N");
	System.out.println();
	
	int counter = 1;
	
	while (counter <=5) {
	
	
	System.out.printf("%d\t %d\t%d\t%d%n", counter *1, counter *10, counter *100, counter *1000);
	
	counter++;
		}
	}
}
