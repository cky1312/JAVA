package Codeforces;

import java.util.*;
public class EshagLovesBigArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int c = 0;
            for(int i = 0; i < n; i++){
                if(arr[0] == arr[i])
                    c++;
            }
            System.out.println(n - c);
        }
    }
}
