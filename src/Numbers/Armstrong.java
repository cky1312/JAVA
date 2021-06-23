package Numbers;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = sc.nextInt();
        //numberOfDigit(n);
        System.out.println(isArmstong(n));

    }
    static boolean isArmstong(int n){
        int sum = 0, temp = n,x=numberOfDigit(n);
        while(temp>0){
            sum = (int) (sum + pow(temp%10 , x));
            temp = temp/10;
        }
        if(sum == n)
            return true;
        else
            return false;
    }
    static int numberOfDigit(int n){
        int x = 0;
        while(n>0){
            x++;
            n = n/10;
        }
        return x;
    }
}
