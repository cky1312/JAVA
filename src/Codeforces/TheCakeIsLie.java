package Codeforces;

import java.util.*;
public class TheCakeIsLie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
//            if(n != 1 && m!= 1) {
                if ((m - 1) + (n-1)*m == k)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
//            else
//                System.out.println("Yes");
//        }
    }
}
