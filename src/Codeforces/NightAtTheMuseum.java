package Codeforces;

import java.util.*;
public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char p = 'a';
        for(int i=0;i<s.length();i++){
            int x = Math.abs(s.charAt(i)-p);
            count += Math.min(x,Math.abs(26-x));
            p = s.charAt(i);
        }
        System.out.println(count);
    }
}
