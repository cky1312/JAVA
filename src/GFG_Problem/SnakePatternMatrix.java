package GFG_Problem;
import java.util.*;
public class SnakePatternMatrix {
    static void getSnake(int[][] arr ,int r, int c){
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Snake Pattern Array:-");
        getSnake(arr,r,c);
    }
}
