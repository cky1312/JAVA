// package LoveBabbarCheatSheat450.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = n-1; i >= 0; i--){
            arr[i] = sc.nextInt();
        }
        for (int j:arr) {
            System.out.print(j+" ");
        }
    }
}
