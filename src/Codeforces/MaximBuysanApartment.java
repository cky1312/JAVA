package Codeforces;

import java.util.Scanner;

public class MaximBuysanApartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int min = 0, max = 0;
        if(k == 0){
            System.out.println("0 0");
            return;
        }
        if(k == n){
            min = 0;
        }
        else
            min = 1;

        if(k <= n/3)
            max = 2*k;
        else
            max = n-k;

        System.out.println(min+" "+max);
    }
}
