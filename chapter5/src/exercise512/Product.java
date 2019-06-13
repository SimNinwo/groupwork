package chapter5.exercise512;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter;
		long product = 1;
		int size = 25;
		
		for(counter = 1; counter <= size; counter++) {
			if (counter % 2 != 0) {
				product *= counter;
				System.out.println("Odd number " + counter);
			}
		}
		System.out.println("Product of odd integers is: " + product);
	}
}
