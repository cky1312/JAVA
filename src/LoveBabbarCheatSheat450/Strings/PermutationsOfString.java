package LoveBabbarCheatSheat450.Strings;

import java.util.*;
public class PermutationsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();

        int n = str.length();
        System.out.println("Permutations using Recursion");
        permute(str,0,n-1);

        System.out.println("Permutations using iteration");
        permutationIterative(str);
    }

    static void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        else{
            for(int i = l; i <= r; i++){
                str = swap(str, l, i);
                permute(str, l + 1, r);
                swap(str, l, i);
            }
        }
    }
    static String swap(String str, int i, int j){
        char temp;
        char[] chararray = str.toCharArray();
        temp = chararray[i];
        chararray[i] = chararray[j];
        chararray[j] = temp;

        return String.valueOf(chararray);
    }

    static int factorial(int n){
        int f = 1;
        for(int i = 2; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    static void permutationIterative(String str){
        int n = str.length();
        int f = factorial(n);

        for(int i = 0; i < f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;

            for(int div = n; div >= 1; div--){
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp = q;
            }
            System.out.println();
        }
    }
}
