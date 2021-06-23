package Codeforces;

import java.util.*;
public class StringLCM {

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.next();
        while (q-- > 0){
            String s = sc.next();
            String t = sc.next();
            sc.next();
            int sl = s.length();
            int tl = t.length();
            int l = lcm(sl,tl);

            int d1 = l/sl;
            int d2 = l/tl;
            String s1 = "" , t1 = "";
            for(int i=0;i<d1;i++){
                s1 += s;
            }
            for(int i=0;i<d2;i++){
                t1 += t;
            }

            System.out.println(s1+"  "+t1);
        }
    }
}
