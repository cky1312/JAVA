// package LoveBabbarCheatSheat450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Max Element -> "+arr[n-1]+"\nMin Element -> "+arr[0]);
    }
}
