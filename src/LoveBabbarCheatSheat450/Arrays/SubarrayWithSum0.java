package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class SubarrayWithSum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSubarrayPresent(arr,n));  // O(n^2)  O(1)
        System.out.println(isSubarrayPresent2(arr,n)); // O(n)   O(n)
    }

    static boolean isSubarrayPresent(int[] arr, int n){
        boolean found = false;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0){
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        return found;
    }
    static boolean isSubarrayPresent2(int[] arr, int n){
        boolean found = false;
        Set<Integer> s = new HashSet<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            s.add(sum);
            sum += arr[i];
            if(s.contains(sum)){
                found = true;
                break;
            }
        }
        return found;
    }
}
