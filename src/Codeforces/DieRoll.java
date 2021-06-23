package Codeforces;

import java.util.*;
public class DieRoll {
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int y = sc.nextInt(), w = sc.nextInt();
        int diff = 6 - Math.max(y,w) + 1;
        int a = gcd(diff,6);
        System.out.println(diff/a+"/"+6/a);
    }
}
