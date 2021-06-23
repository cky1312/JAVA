package LoveBabbarCheatSheat450.Matrix;

import java.util.Scanner;

public class SpiralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }


    }
}
