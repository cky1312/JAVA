package Codeforces;

import java.util.*;
public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int c = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                c++;
        }
        System.out.println(c);
    }
}
