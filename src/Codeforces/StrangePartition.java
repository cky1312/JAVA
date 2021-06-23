package Codeforces;

import java.util.*;
public class StrangePartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            int[] arr = new int[n];
            long maxBeauty = 0, minBeauty = 0,sum = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
                if(arr[i] % x == 0)
                    maxBeauty += arr[i]/x;
                else
                    maxBeauty += arr[i]/x + 1;
            }
            if(sum%x==0)
                minBeauty = (sum/x);
            else
                minBeauty = (sum/x) + 1;


            System.out.println(minBeauty+" "+maxBeauty);
        }
    }
}
