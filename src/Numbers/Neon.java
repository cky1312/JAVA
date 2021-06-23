package Numbers;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
        int Square = n*n;
        int sum=0;
        while (Square>0){
            sum = sum + Square%10;
            Square = Square/10;
        }
        if(sum == n)
            System.out.println(n+" is neon number.");
        else
            System.out.println(n+" is not neon number.");
    }
}
