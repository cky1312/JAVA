package LoveBabbarCheatSheat450.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr2 = { 5, 10, 15 };
        int[] arr1 = { 3, 8, 9, 17};

        merge(arr1, arr2);
        System.out.println("Merged and Sorted Array");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Merged and Sorted Array by 2nd method");
        merge2(arr1, arr2);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;

        for (int i = n - 1; i >= 0; i--) {

            int j, last = arr1[m - 1];

            for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            if (j != m - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    static void merge2(int[] arr1, int[] arr2){
        int i = arr1.length - 1;
        int j = 0;
        int m = arr2.length;
        while(i >= 0 && j < m){
            if(arr1[i] >= arr2[j]){
                arr1[i] ^= arr2[j];
                arr2[j] ^= arr1[i];
                arr1[i] ^= arr2[j];

                i--;
                j--;
            }

            else
                break;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
