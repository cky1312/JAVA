package LoveBabbarCheatSheat450.Strings;

import java.util.*;
public class Reverse {

    static String reverseAString(String str){
        int l = str.length() - 1;
        String st = "";
        for(int i = l; i >= 0; i--){
            st += str.charAt(i);
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverseAString(str));
    }
}
