package Codeforces;

import java.util.*;
public class AVHPlayingCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sum = sum/(n/2);
        for(int i = 0; i < n; i++){
            if(arr[i] != -1){
                for(int j = i+1; j < n; j++){
                    if(arr[i] + arr[j] == sum){
                        arr[i] = -1;
                        arr[j] = -1;
                        System.out.println((i+1)+" "+(j+1));
                    }
                }
            }
        }
    }
}
