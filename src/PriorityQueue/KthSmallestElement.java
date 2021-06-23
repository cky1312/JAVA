package PriorityQueue;

/**
 * @author Chandresh Yadav
 * @date 23-Jun-21 8:48 AM
 */

import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the Array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(kthSmallest(arr,n,k));

        System.out.println(kthSmallestOptimized(arr,n,k));
    }

    public static int kthSmallest(int[] arr, int n, int k){
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static int kthSmallestOptimized(int[] arr, int n, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
