// package LoveBabbarCheatSheat450.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimizetheheights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getMinDifference(arr,k,n));
    }

    static int getMinDifference(int[] arr,int k, int n){
        if(n == 1)
            return 0;
        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n-1] - k;

        if(small > big){
            small ^= big;
            big ^= small;
            small ^= big;
        }

        for(int i = 1; i < n-1; i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            if(subtract >= small || add <= big){
                continue;
            }
            if(big - subtract <= add - small){
                small = subtract;
            }
            else
                big = add;
        }

        return(Math.min(ans,big-small));
    }
}
