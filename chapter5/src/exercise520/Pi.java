package chapter5.exercise520;

public class Pi {
	
	
	public double calculatePi() {
		int n = 1;
		double pi = 0;
		double newValue = -4;
		
		while (n <= 400000) {
			newValue *= -1; 
			pi += newValue/n;
			System.out.println("Pi is: " + pi);
			n +=2;
		}
		return pi;
	}
}
