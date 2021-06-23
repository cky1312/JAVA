package Codechef;

import java.util.*;
public class ADAKING {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int k = sc.nextInt();
                char[][] arr = new char[8][8];
                int c = 1;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (c <= k) {
                            c++;
                            arr[i][j]='.';
                        } else
                            arr[i][j] = 'X';
                    }
                }
                arr[0][0]='O';
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
        catch (Exception e){

        }
    }
}
