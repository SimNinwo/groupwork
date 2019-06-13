package chapter5.exercise513;

public class Factorial {

	public void calFactorial() {
		long n = 1;

		System.out.println("Number\t Factorial");
		
		for(int counter= 1; counter <= 20; counter++ ) {
			n = n * counter;		
			System.out.println(counter + "\t" + n);
		}	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial num = new Factorial();
		
		num.calFactorial();
	}

}
