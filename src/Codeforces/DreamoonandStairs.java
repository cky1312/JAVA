package Codeforces;

import java.util.*;
public class DreamoonandStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n < m)
            System.out.println("-1");
        else
            System.out.println(((2*m)+n-1)/2/m*m);
    }
}
