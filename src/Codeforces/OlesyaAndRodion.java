package Codeforces;

import java.math.BigInteger;
import java.util.*;
public class OlesyaAndRodion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        if(t>=1 && t<=9){
            for (int i =0 ;i < n; i++){
                System.out.print(t);
            }
        }
        else{
            if(n>1) {
                System.out.print("1");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print("0");
                }
            }
            else
                System.out.println("-1");
        }
    }
}
