package Numbers;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number You want.");
        int n = sc.nextInt();
        System.out.println(isAutomorphic(n));
    }
    static boolean isAutomorphic(int n){
        int square = n*n;
        while(n>0){
            if(n%10 != square%10)
                return false;
            n = n/10;
            square = square/10;
        }
        return true;
    }
}
