package Codeforces;

import java.util.*;
public class AVHMCommentary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();           // no of initial commentary boxes
        long m = sc.nextLong();           // no of delegations
        long a = sc.nextLong();           // fee to build a box
        long b = sc.nextLong();           // fee to demolish a box

        long minBurles = 0;
        if(n % m != 0){
            long diff = (long) (Math.floor(n/m)+1);
            diff *= m;
            diff -= n;
            long extraBox = n % m;
            minBurles = Math.min(extraBox * b, diff * a);
        }
        System.out.println(minBurles);
    }
}
