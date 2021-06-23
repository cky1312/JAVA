package LoveBabbarCheatSheat450.Strings;

import java.util.*;
public class PalindromeOrNot {
    static boolean isPalindrome(String str){
        int l = 0, r = str.length()-1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrome(str))
            System.out.println(str+" is a Palindrome.");
        else
            System.out.println(str+" is not a Palindrome.");
    }
}
