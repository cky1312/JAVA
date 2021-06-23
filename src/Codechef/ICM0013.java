package Codechef;

import java.util.*;
public class ICM0013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = 1, c = 0;
            while(n % m <= n / 2){
                c++;
                m++;
            }
            System.out.println(c);
        }
    }
}
