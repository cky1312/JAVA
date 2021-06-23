package GFG_Problem;

import java.util.*;
public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotated array by 90 degree left is:");
        rotatedBy90(arr,r,c);
    }

    static void rotatedBy90(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<r;i++){
            int l = 0, h = r-1;
            while(l < h){
                int temp = arr[l][i];
                arr[l][i] = arr[h][i];
                arr[h][i] = temp;

                l++;
                h--;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
