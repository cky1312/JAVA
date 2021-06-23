package Codechef;

import java.util.*;
public class DIVTHREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i =0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int  a = sum/k;
            if(a > d)
                System.out.println(d);
            else
                System.out.println(a);
        }
    }
}
