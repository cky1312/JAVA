package Leetcode;

import java.util.*;
public class H_Index_II {
    static int hIndex(ArrayList<Integer> arr){
        int n = arr.size();
        int h = 0;
        for(int i = 0; i < n;){
            if(arr.get(i) < n - i)
                i++;
            else {
                h = i;
                break;
            }
        }
        return n - h;
    }

    static int hIndexBinarySearch(ArrayList<Integer> arr){
        int n = arr.size();
        int l = 0, r = n - 1;
        while(l < r){
            int mid = (l + r) / 2;
            if(arr.get(mid) == n - mid)
                return n - mid;
            else if(arr.get(mid) > n - mid)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return n - l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        System.out.println(hIndex(arr));
        System.out.println(hIndexBinarySearch(arr));
    }
}
