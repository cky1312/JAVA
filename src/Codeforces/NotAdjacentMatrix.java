package Codeforces;

import java.util.*;
public class NotAdjacentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            if(n == 1)
                System.out.println(1);
            else if(n == 2)
                System.out.println(-1);
            else {
                int[][] arr = new int[n][n];
                int a = 1;
                for(int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                            arr[i][j] = a;
                            a += 2;
                            if(a > n*n){
                                a = 2;
                            }
                            System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
