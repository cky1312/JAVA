//package Codeforces;

import java.util.*;
public class LCM_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            if(r>=2*l)
                System.out.println(l+" "+2*l);
            else
                System.out.println(-1+" "+(-1));
        }
    }
}
