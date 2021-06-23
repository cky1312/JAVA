package GFG_Problem;

import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int m = sc.nextInt();
        int[][] arr = new int [m][];
        System.out.println("Your Jagged Array is :-");
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
