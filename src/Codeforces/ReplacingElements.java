package Codeforces;

import java.util.*;
public class ReplacingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int d = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if(arr[n-1] <= d)
                System.out.println("yes");
            else{
                if(arr[0] + arr[1] <= d)
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}
