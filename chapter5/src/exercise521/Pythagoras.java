package chapter5.exercise521;

public class Pythagoras {
	
	public void display3Sides() {
		int i;
		int j;
		int k;
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("Hypotenuse\tSide1\t\tSide2");
		
		for(i = 1;i <= 500; i++) {
			for(j = 1;j <= i; j++) {
				for(k = 1;k <= j;k++) {
					a = i * i;
					b = j * j;
					c = k * k;
					if(a == (b+c)) {
						System.out.println(i + "\t\t"+j+"\t\t"+k);
					}
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pythagoras triangle = new Pythagoras();
		
		triangle.display3Sides();
	}

}