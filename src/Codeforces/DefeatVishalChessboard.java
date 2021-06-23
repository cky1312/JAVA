package Codeforces;
import java.util.*;
public class DefeatVishalChessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        while(m-- > 0){
            int c = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
            arr[x][y] = -1;
            for(int i = 0;i<n;i++){
                for(int j =0 ;j<n;j++){
                    if(arr[i][j]!=-1) {
                        if (i != x && j != y){
                            c++;
                            arr[i][j]=-1;
                        }
                    }
                }
            }
            System.out.print(c+" ");
        }
    }
}
