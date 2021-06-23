package Codeforces;

import java.util.*;
public class PhoenixAndGold {

    static void isPossible(int[] arr, int n, int x){
            int sum = 0;
            Arrays.sort(arr);
            for(int i = 0; i < n; i++){
                sum = sum + arr[i];
                if(sum == x){
                    int t = arr[i];
                    arr[i] = arr[n-1];
                    arr[n-1] = t;
                    break;
                }
            }
            sum = 0;
            boolean b = true;
            for(int i = 0; i < n; i++){
                sum += arr[i];
                if(sum == x){
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println("Yes");
                for (int i: arr) {
                    System.out.print(i + " ");
                }
            }
            else
                System.out.print("No");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            isPossible(arr,n,x);
        }
    }
}
