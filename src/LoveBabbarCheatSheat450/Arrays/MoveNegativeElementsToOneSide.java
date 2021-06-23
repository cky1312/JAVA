// package LoveBabbarCheatSheat450.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveNegativeElementsToOneSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,n);
    }

    static void sort(int[] arr, int n){
        int left = 0, right = n-1;
        while(left <= right){
            if(arr[left] < 0 && arr[right] < 0){
                left++;
            }
            else if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left] > 0 && arr[right] > 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }

        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
