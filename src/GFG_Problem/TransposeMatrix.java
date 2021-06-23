package GFG_Problem;

import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the number of rows:");
            int r = sc.nextInt();
            System.out.println("Enter the number of column:");
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                     arr[i][j] = sc.nextInt();
                }
            }
            transposeMatrix(arr,r,c);
        }
    }
    static void transposeMatrix(int arr[][],int r,int c){
/* Without using temporary array */
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        /* ***************Using temporary array*****************/
//        int[][] temp = new int[r][c];
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                temp[i][j] = arr[j][i];
//            }
//        }
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                System.out.print(temp[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
