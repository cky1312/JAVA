//package Codeforces;

import java.util.*;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        countMinStep(arr, 5);
    }

    static void countMinStep(int arr[][], int n) {

        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    c = Math.abs(i - 2) + Math.abs(j - 2);
                    break;
                }
            }
        }
        System.out.println(c);
    }
}
