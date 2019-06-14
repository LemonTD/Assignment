package chapter5.exercise5_16;

import java.util.Scanner;

public class BarChartTest {
	public static void main(String[] args) {
		
		Scanner pim = new Scanner(System.in);
		
		System.out.println("Enter Number (1-30): ");
		int number1 = pim.nextInt();
		int number2 = pim.nextInt();
		int number3 = pim.nextInt();
		int number4 = pim.nextInt();
		int number5 = pim.nextInt();
		
		
		BarChart lem = new BarChart();
		
		lem.getBarChart(number1);
		lem.getBarChart(number2);
		lem.getBarChart(number3);
		lem.getBarChart(number4);
		lem.getBarChart(number5);
	}

}
