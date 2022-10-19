import java.util.*;

public class MyCalcu
{
    public static void main(String[] args) 
    {
    //Variables
        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

    //Scan the input from the user
        Scanner scanCalcu = new Scanner(System.in);

    //Get input from the user
        System.out.println("Enter first number: ");
        num1 = scanCalcu.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanCalcu.nextInt();
        System.out.println("What operation? ");
        operator = scanCalcu.next().charAt(0);

    //Switch statement for operators
    switch (operator)
    {
        case '+': answer = num1 + num2;
        break;
        case '-': answer = num1 - num2;
        break;
        case '*': answer = num1 * num2;
        break;
        case '/': answer = num1 / num2;
        break;
    }
    //Display the output
    System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}