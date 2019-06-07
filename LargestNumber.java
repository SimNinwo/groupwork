import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        int newNumber;
        int largest =0;
        int counter = 1;
        while(counter <= 10){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter new number");
            newNumber =input.nextInt();
            if(newNumber > largest){
                largest = newNumber;
            }
            counter++;
        }
        System.out.println(largest);
    }
}