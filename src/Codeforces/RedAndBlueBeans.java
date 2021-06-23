package Codeforces;

//4
//        1 1 0  Yes
//        2 7 3  Yes
//        6 1 4  No
//        5 4 0  No

import java.util.*;
public class RedAndBlueBeans {

    static boolean isPossible(int r, int b, int d){
        int min = Math.min(r,b);
        int max = Math.max(r,b);
        if(max - min <= d)
            return true;

//        r -= min;
//        b -= min;
//        min -= min;
        max -= min;

        if((max + min - 1)/min <= d)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int r = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();

            if(isPossible(r,b,d))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
