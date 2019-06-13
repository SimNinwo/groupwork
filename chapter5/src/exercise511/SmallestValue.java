package chapter5.exercise511;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
	
		int size;
		
		System.out.print("Enter number of input: ");
		size = input.nextInt();
		
		System.out.print("Enter number: ");
		int value = input.nextInt();
		
		int smallestValue = value;
		
		while(counter < size) {
			System.out.print("Enter number: ");
			value = input.nextInt();
			if (smallestValue > value) {
				smallestValue = value;
				}
			++counter;
		}
		System.out.println("Smallest number is " + smallestValue);
		
		input.close();
	}
	
}
