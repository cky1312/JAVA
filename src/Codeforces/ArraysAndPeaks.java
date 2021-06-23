package Codeforces;

import java.util.*;
public class ArraysAndPeaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(k <= (n-1)/2){
                System.out.print("1"+" ");
                for(int i = 1; i <= k; i++){
                    System.out.print(2*i+1+" "+2*i+" ");
                }
                for(int i = 2*k+2; i <= n; i++){
                    System.out.print(i+" ");
                }
            }
            else
                System.out.println("-1");

            System.out.println();
        }
    }
}
