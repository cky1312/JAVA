package Codeforces;

import java.util.*;
public class GCD_Sum {
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }
    static long sum(long n){
        long sum = 0;
        while(n > 0){
            long r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            while(gcd(n,sum(n)) <= 1){
                n++;
            }
            System.out.println(n);
        }
    }
}
