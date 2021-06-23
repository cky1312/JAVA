package Codeforces;

import java.util.*;
public class NezzarAndLuckyNumber {

    static boolean find(int q,int d){
        while(q>0){
            int a = q%10;
            if(a == d)
                return true;
            q /= 10;
        }
        return false;
    }

    static boolean checked(int a,int d){
        while( a > 0){
            if(find(a,d))
                return true;
            a -= d;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int q = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[q];

            for(int i = 0; i < q; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < q; i++) {
                if(checked(arr[i],d))
                    System.out.println("Yes");
                else
                    System.out.println("NO");
            }
        }
    }
}
