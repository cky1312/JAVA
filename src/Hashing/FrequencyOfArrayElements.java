package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.println("Enter the length of the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Frequency:");
            frequencyOfElements(arr,n);
        }

    }
    static void frequencyOfElements(int[] arr, int n){
        HashMap<Integer,Integer> h = new HashMap<>(n);
        for(int i=0;i<n;i++) {
            if (h.containsKey(arr[i]))
                h.put(arr[i],h.get(arr[i])+1);
            else
                h.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
}
