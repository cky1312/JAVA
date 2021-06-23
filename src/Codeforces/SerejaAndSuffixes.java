package Codeforces;

import java.util.*;
public class SerejaAndSuffixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[n+1];
//        for(int i = 0; i < n; i++){
//            brr[i] = sc.nextInt();
//        }

        HashSet<Integer> h = new HashSet<>();
        for(int i = n - 1; i >= 0; i--){
            h.add(arr[i]);
            brr[i] = h.size();
        }
        int a;
        while(m-- >= 1){
            a = sc.nextInt();
            System.out.println(brr[a - 1]);
        }
    }
}
