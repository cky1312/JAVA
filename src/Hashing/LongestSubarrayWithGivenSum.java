package Hashing;

import java.util.*;
import java.util.Map;
public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of testcases:");
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.println("Enter the length of array:");
            int n = sc.nextInt();
            System.out.println("Enter the sum u wanted to search:");
            int sum = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Length of the longest sub-array is: " + longestSubarray(arr,n,sum));

        }
    }
    static int longestSubarray(int[] arr,int n,int sum){
        HashMap<Integer,Integer>h = new HashMap<>();
        int prex_sum=0,res=0;
        for(int i=0;i<n-1;i++){
            prex_sum += arr[i];
            if(prex_sum == sum)
                res = i+1;
            if(h.containsKey(prex_sum) == false)
                h.put(prex_sum,i);
            if(h.containsKey(prex_sum - sum))
                res = Math.max(res,(i- h.get(prex_sum-sum)));
        }
        return res;
    }
}
