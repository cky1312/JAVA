// package LoveBabbarCheatSheat450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            if (n == 1){
                System.out.println(arr[0]);
            }
            else{
                int a = arr[n-1];
                for(int i = n-1; i>0; i--){
                    arr[i] = arr[i-1];
                }
                arr[0] = a;
                System.out.println(Arrays.toString(arr));
                for (int i:arr
                     ) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    }
}
