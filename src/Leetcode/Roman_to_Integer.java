package Leetcode;

import java.util.Scanner;

public class Roman_to_Integer {
    static int romanToInteger(String s){
        int sum = 0;
        char I = 1;
        char V = 5;
        char X = 10;
        char L = 50;
        char C = 100;
        char D = 500;
        char M = 1000 ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == I)
                sum = sum+I;
            if(s.charAt(i) == V)
                sum = sum+V;
            if(s.charAt(i) == X)
                sum = sum+X;
            if(s.charAt(i) == L)
                sum = sum+50;
            if(s.charAt(i) == C)
                sum = sum+100;
            if(s.charAt(i) == D)
                sum = sum+D;
            if(s.charAt(i) == M)
                sum = sum+M;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(romanToInteger(S));
    }
}
