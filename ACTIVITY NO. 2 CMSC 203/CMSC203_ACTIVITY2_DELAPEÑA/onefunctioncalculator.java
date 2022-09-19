import java.util.Scanner;
public class onefunctioncalculator {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        input.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}