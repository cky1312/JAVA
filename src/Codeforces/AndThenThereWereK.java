package Codeforces;

import java.util.*;

public class AndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int res = ((int) Math.pow(2,Countbits(n)-1) ) -  1;
            System.out.println(res);
//            int d = n;
//            while(n >0){
//                if(d == 0)
//                    break;
//                d = d & (n - 1);
//                n--;
//            }
//            System.out.println(n);
        }
    }
    static int Countbits(int n) {
        return (int)(Math.log(n) / Math.log(2) + 1);
    }
}
