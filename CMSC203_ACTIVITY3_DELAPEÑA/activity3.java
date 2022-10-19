import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = 0;
    int y = 0;
//hindi ko po magaya code niyo ma'am pero eto po pagkaintindi ko
//ayoko po ipasa yung code niyo eh hehe
    System.out.println("INPUT: ");
    System.out.println("Enter value of x: ");
    x = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter value of y: ");
    y = scan.nextInt();
    scan.nextLine();
    System.out.println("OUTPUT: ");
    System.out.println("Result: ");
    if(x < y) {
        System.out.println("\nFIRST");
    }
    else if(x == y) {
        System.out.println("\nANY");
    }
    else if(x > y) {
        System.out.println("\nSECOND");
    }
    }
    
}
