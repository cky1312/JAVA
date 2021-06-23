package Codeforces;

import java.util.*;
public class ArrayReodering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int[] temp = new int[n];
            int a = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0)
                    temp[a++] = arr[i];
            }
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 != 0)
                    temp[a++] = arr[i];
            }
            int c = 0;
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    if(gcd(temp[i],temp[j] * 2) > 1)
                        c++;
                }
            }
            System.out.println(c);
        }
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
