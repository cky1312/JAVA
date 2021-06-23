package Codeforces;

import java.util.*;
public class DominoOnWindowsill {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int w = sc.nextInt();
            int b = sc.nextInt();

            int wSum = k1 + k2;
            int bSum = (2 * n) - wSum;

            wSum = wSum / 2;
            bSum = bSum / 2;
            if (w <= wSum && b <= bSum)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
