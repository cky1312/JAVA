package Codechef;

import java.util.*;

public class SEDARR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int c = 0;
            if(sum % k != 0){
                int diff = sum % k;
                arr[0] = arr[0] + diff;
                c++;
            }
            System.out.println(c);
        }
    }
}
