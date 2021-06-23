package GFG_Problem;

import java.util.*;
public class BoundaryElements {
    static void printBoundary(int[][] arr, int r, int c){
        if(r==1)
            for(int i=0;i<c;i++)
                System.out.println(arr[0][i]+" ");
        else if(c==1)
            for(int i=0;i<r;i++)
                System.out.println(arr[i][0]+" ");
        else{
            for(int i=0;i<c;i++)
                System.out.println(arr[0][i]+" ");
            for(int i=1;i<r;i++)
                System.out.println(arr[i][c-1]+" ");
            for(int i=c-2;i>=0;i--)
                System.out.println(arr[r-1][i]+" ");
            for(int i=r-2;i>=1;i--)
                System.out.println(arr[i][0]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The boundary elements are:");
        printBoundary(arr,r,c);
    }
}
