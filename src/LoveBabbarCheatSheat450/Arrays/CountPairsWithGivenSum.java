package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class CountPairsWithGivenSum {
    static int countPairs(int[] arr, int n, int k){
        int pairCount = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == k)
                    pairCount++;
            }
        }

        return pairCount;
    }

    static int pairCount1(int[] arr, int n, int k){
        int countPair = 0;

        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!h.containsKey(arr[i]))
                h.put(arr[i],0);
            h.put(arr[i],h.get(arr[i])+1);
        }
        for(int i = 0; i < n; i++){
            if(h.get(k-arr[i]) != null)
                countPair += h.get(k-arr[i]);

            if(k - arr[i] == arr[i])
                countPair--;
        }
        countPair /= 2;
        return countPair;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // length of the array
        int k = sc.nextInt();    // value of k
        int[] arr = new int[n];  // array with length n

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(countPairs(arr,n,k));    // O(n^2)    O(1)
        System.out.println(pairCount1(arr,n,k));    // O(n)      O(n)
    }
}
