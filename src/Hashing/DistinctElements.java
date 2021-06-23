package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the length of the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("The number of distinct element is: ");
            distinctElements(arr,n);
        }
    }
    static void distinctElements(int[] arr, int n){
        HashSet<Integer>h = new HashSet<>();
        for(int i = 0;i<n;i++){
            h.add(arr[i]);
        }
        System.out.println(h.size());
    }
}
