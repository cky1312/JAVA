//package Codeforces;

import java.util.*;
public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] arr = new int[4];
            int[] brr = new int[4];
            for(int i = 0; i < 4; i++){
                arr[i] = sc.nextInt();
                brr[i] = arr[i];
            }
            Arrays.sort(arr);
            int fHighest = arr[3];
            int sHighest = arr[2];

            int m1 = Math.max(brr[0],brr[1]);
            int m2 = Math.max(brr[2],brr[3]);
            if((m1 == fHighest && m2 == sHighest) || m2 == fHighest && m1 == sHighest)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
