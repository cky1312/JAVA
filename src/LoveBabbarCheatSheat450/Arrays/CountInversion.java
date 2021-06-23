package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class CountInversion {
    static int inversion(int[] arr, int n){
        int inv = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j])
                    inv++;
            }
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("No of Inversions are: "+ inversion(arr,n)); // O(n^2)

    }
}
