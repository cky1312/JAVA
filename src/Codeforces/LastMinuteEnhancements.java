//package Codeforces;

import java.util.*;
public class LastMinuteEnhancements {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                if(n==1)
                    break;
                else if(i == n-1 && arr[i] == arr[i-1])
                    arr[i] += 1;
                else if( i > 0 && i < n-1){
                    if(arr[i] != arr[i+1] && arr[i] == arr[i-1] )
                        arr[i] += 1;
                }
            }

            HashSet<Integer> h = new HashSet<>(n);
            for(int i=0;i<n;i++){
                h.add(arr[i]);
            }
            System.out.println(h.size());
        }
    }
}
