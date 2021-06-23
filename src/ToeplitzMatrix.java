import java.util.*;
public class ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] arr = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
            if(isToeplitz(arr,r,c))
                System.out.println("The given matrix is a Toeplitz.");
            else
                System.out.println("The given matrix is not a Toeplitz.");
        }
    }
    static boolean isToeplitz(int[][] arr, int r, int c){
        for(int i = 0; i < r - 1; i++){
            for(int j = 0; j < c - 1; j++){
                if(arr[i][j] != arr[i + 1][j + 1])
                    return false;
            }
        }
        return true;
    }
}
