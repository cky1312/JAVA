package GFG_Problem;

import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of column:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Spiral Matrix is:");
        spiralMatrix(arr,r,c);
    }
    static void spiralMatrix(int arr[][],int r,int c){
        int top=0,left=0,bottom=r-1,right=c-1;
        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++)
                System.out.print(arr[top][i]+" ");
            top++;
            for(int i=top;i<=bottom;i++)
                System.out.print(arr[i][right]+" ");
            right--;
            if(top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--)
                    System.out.print(arr[i][left]+" ");
                left++;
            }
        }
    }
}
