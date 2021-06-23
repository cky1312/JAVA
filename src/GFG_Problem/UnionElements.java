package GFG_Problem;

import java.util.HashSet;
import java.util.Scanner;

public class UnionElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the length of 1st Array:");
            int m = sc.nextInt();
            int[] arr = new int[m];
            System.out.println("Enter the elements of 1st Array:");
            for (int i = 0; i < m; i++)
                arr[i] = sc.nextInt();

            System.out.println("Enter the length of 2nd Array:");
            int n = sc.nextInt();
            int[] brr = new int[n];
            System.out.println("Enter the elements of 2nd Array:");
            for (int i = 0; i < n; i++)
                brr[i] = sc.nextInt();

            System.out.println("Number Union elements is:");
            unionOfArrays(arr, brr, m, n);
        }
    }
    static void unionOfArrays(int[] arr,int[] brr,int m,int n){
        HashSet<Integer>h = new HashSet<>();
        for(int i=0;i<m;i++)
            h.add(arr[i]);
        for(int i=0;i<n;i++)
            h.add(brr[i]);
        System.out.println(h.size());
    }
}
