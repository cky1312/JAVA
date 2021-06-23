package LoveBabbarCheatSheat450.Arrays;

import java.util.*;

public class MinStepsToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minStepsDP(arr, n));     // Complexity: T = N^2  S = N
        System.out.println(minSteps(arr, n));       // Complexity: T = N    S = 1
        sc.close();
    }

    static int minStepsDP(int[] arr, int n) {
        if (n == 0)
            return -1;

        int[] minJumps = new int[n];
        for (int i = 0; i < n; i++) {
            minJumps[i] = Integer.MAX_VALUE;
        }

        minJumps[0] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= i + arr[i] && j < n; j++) {
                minJumps[j] = Math.min(minJumps[j], 1 + minJumps[i]);
            }
        }
        return minJumps[n - 1];
    }

    static int minSteps(int[] arr, int n){
        if(n <= 1)
            return 0;
        
        if(arr[0] == 0)
            return -1;
        
        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for(int i = 1; i < n; i++){
            if(i == n - 1)
                return jump;
            
            maxReach =  Math.max(maxReach, i + arr[i]);

            step--;

            if(step == 0){
                jump++;

                if(i >= maxReach)
                    return -1;

                step = maxReach - i;
            }
        }
        return -1;
    }
}
