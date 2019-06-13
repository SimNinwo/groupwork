package chapter5.exercise514;

import java.util.Scanner;

public class CompoundInterest {
	
	Scanner input = new Scanner(System.in);

	
	public double interest( ) {
		
		System.out.print("Enter initial Savings: ");
		int p = input.nextInt();
		
		System.out.print("Enter number of years: ");
		int n = input.nextInt();
		
		double a = 0;
		
		int counter;
		
		System.out.printf("%s\t%s%20s%n", "Year", "Interest Rate", "Amount on deposit");
		
		
		for (counter = 1; counter <= n; ++counter) {
			for (int interest = 5; interest <= 10; ++interest) {
				
				double r = (double) interest / 100;
				
				a = p * Math.pow((1+r), counter);
				
				System.out.printf("%d\t%d \t\t$%.2f%n", counter, interest, a);
			}
			System.out.println();
		}
		return a;
	}
}


