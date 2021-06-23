package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class BestTimeToBuyAndSellStock {

    static int maxProfit(int[] arr, int n){
        int maxProfit = 0, finalMaxProfit = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] > arr[i])
                    maxProfit = arr[j] - arr[i];
                finalMaxProfit = Math.max(maxProfit,finalMaxProfit);
            }
        }

        return finalMaxProfit;
    }

    static int maxProfit1(int[] arr, int n){
        int minSoFar = arr[0];
        int maxProfit = 0;
        int profit;
        for(int i = 0; i < n; i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr,n));           // O(n^2)

        System.out.println(maxProfit1(arr,n));          // O(n)
    }
}
