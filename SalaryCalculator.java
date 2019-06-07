import java.util.Scanner;
public class SalaryCalculator{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

    String employeeName;
    int hours= 0;
    double hourlyRate;
    int overTimeHours;
    double grossPay = 0;
    int counter = 0;

    while(counter < 3){
            System.out.println("Enter hours worked");
            hours = input.nextInt();
            System.out.println("Enter amount per hour");
            hourlyRate = input.nextDouble();

            grossPay = ((40*hourlyRate)+(1.5 * hourlyRate *(hours-40)));
            System.out.print(grossPay);    
        }
    }
}