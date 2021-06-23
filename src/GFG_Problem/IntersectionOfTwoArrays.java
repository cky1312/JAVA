package GFG_Problem;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the length of Ist array:");
            int m = sc.nextInt();

            int[] arr = new int[m];
            System.out.println("Enter the elements of Ist array");
            for(int i=0;i<m;i++)
                arr[i] = sc.nextInt();

            System.out.println("Enter the length of IInd array");
            int n = sc.nextInt();

            int[] brr = new int[n];
            System.out.println("Enter the elements of IInd array");
            for(int i=0;i<n;i++)
                brr[i] = sc.nextInt();

            System.out.println("Intersection of two array is:");
            intersectionOfArrays(arr,brr,m,n);
        }
    }
    static void intersectionOfArrays(int[] arr, int[] brr, int m, int n){
        HashSet<Integer>h = new HashSet<>();
        for(int i=0;i<m;i++){
            h.add(arr[i]);
        }
        int c = 0;
        for(int j=0;j<n;j++){
            if(h.contains(brr[j])) {
                c++;
                h.remove(brr[j]);
            }
        }
        System.out.println(c);
    }
}
