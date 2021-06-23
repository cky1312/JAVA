// package LoveBabbarCheatSheat450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthMaxAndMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the value of K:");
        int K = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(K+" Max Element -> "+arr[n-K]+"\n"+K+" Min Element -> "+arr[K-1]);
    }
}
