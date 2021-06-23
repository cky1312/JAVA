package Codeforces;

import java.util.*;
public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        int res = 0;
        if(k%10 == r || k%10 == 0)
            res = 1;
        else{
            int i = 1;
            while(true){
                int a = k*i;
                if(a%10 == 0 || a%10 == r)
                    break;
                i++;
            }
            res = i;
        }
        System.out.println(res);
    }
}
