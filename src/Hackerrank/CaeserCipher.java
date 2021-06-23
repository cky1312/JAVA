package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaeserCipher {
    static String caesarCipher(String s, int k) {
        char[] c = s.toCharArray();
        k=k%26;
        for(int i = 0;i < s.length();i++){
            int a = 0;
            if(Character.isAlphabetic(c[i])){
                a = ((int)c[i]);
                a=(a+k);
                if(Character.isLowerCase(c[i])) {
                    if (a > 122)
                        a = a - 26;
                }
                else {
                    if(a>90)
                        a = a - 26;
                }
                System.out.println(a);

            }c[i]=(char)a;
        }
        String ss = "";
        for(int i=0;i<s.length();i++){
            ss += c[i];
        }
        return ss;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int k = sc.nextInt();

        System.out.println(caesarCipher(s,k));
    }
}
