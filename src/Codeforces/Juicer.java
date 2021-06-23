package Codeforces;

import java.util.*;
public class Juicer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0, sum = 0, i = 0;
        while (i < n){
            if(arr[i] <= b){
                sum += arr[i];
                if(sum > d){
                    sum = 0;
                    count++;
                }
            }
            i++;
        }
        System.out.println(count);
    }
}
