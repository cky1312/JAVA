package LoveBabbarCheatSheat450.Arrays;

import java.util.Scanner;

public class SortArrayOf012WithoutAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort012(arr,n);

    }
    static void sort012(int[] arr, int n){
        int low = 0, mid = 0, high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr [low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1)
                mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
