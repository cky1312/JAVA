package Codeforces;

import java.util.*;
public class GCDLength {

    static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    static int countDigit(int c){
        int count = 0;
        while(c > 0){
            count++;
            c /= 10;
        }
        return count;
    }
    static void printXY(int a, int b, int c){
        int C = 1;
        while(countDigit(C) < c)
            C *= 2;
         int x = C, y = C;
         while(countDigit(x) < a)
             x *= 3;
         while(countDigit(y) < b)
             y *= 5;
         System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            printXY(a,b,c);
        }
    }
}
