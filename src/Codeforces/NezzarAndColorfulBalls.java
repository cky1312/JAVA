package Codeforces;

import java.util.*;
public class NezzarAndColorfulBalls {
    static int findMax(int[] arr, int n){
        int m = Integer.MIN_VALUE;
        for(int i =0;i < n;i++){
            m = Math.max(arr[i],m);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n =sc.nextInt();
            int x;
            int[] arr = new int[n+1];
            for(int i = 0; i < n; i++){
                x = sc.nextInt();
                arr[x]++;
            }

//            for (int i: arr) {
//                System.out.print(i+" ");
//            }
            if(n==1){
                System.out.println("1");
            }
            else
                System.out.println(findMax(arr,n));
        }
    }
}
