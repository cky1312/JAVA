//package Codeforces;

import java.util.*;
public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(m * a > b){
            int r = n % m * a;
            if(r > b)
                System.out.println(n / m * b + b);
            else
                System.out.println(n / m * b + r);
        }
        else
            System.out.println(n * a);

    }
}
