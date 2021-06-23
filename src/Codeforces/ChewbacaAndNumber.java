//package Codeforces;

import java.util.*;
public class ChewbacaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        minNumber(n);
    }

    static void minNumber(long n){
        int min = 1, a = 1;
        int l = Integer.toString((int) n).length();
        int[] arr = new int[l];
        while(n>0){
            arr[l-a] = (int) (n % 10);
            n /= 10;
            a++;
        }
        for(int i = l - 1; i >= 0; i--){
            if(i != 0) {
                if (9 - arr[i] < arr[i])
                    arr[i] = 9 - arr[i];
            }
            else if(9 - arr[i] < arr[i] && arr[i] != 9){
                arr[i] = 9 - arr[i];
            }
        }
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
