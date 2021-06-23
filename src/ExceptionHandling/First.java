package ExceptionHandling;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number.");
            int a = sc.nextInt();
            System.out.println("Enter the second number.");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("The value of c is = " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0.");
        }
    }
}
