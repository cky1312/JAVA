package Codeforces;

import java.util.*;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int f = arr[0];
            int l = arr[n-1], m = arr[n/2];
            int comparator = 0;
            if(f == l)
                comparator = f;
            else if(f == m)
                comparator = m;
            else if(m == l)
                comparator = l;

            for(int i = 0; i < n; i++){
                if(arr[i] != comparator){
                    comparator = i;
                    break;
                }
            }
            System.out.println(comparator+1);
        }
    }
}
