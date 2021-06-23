package LoveBabbarCheatSheat450.Strings;

import java.util.*;
public class RotationOfOther {
    boolean isRotation(String str1, String str2){
        String temp = str1 + str2;
        if(str1.length() != str2.length())
            return false;
        else {
            for(int i = 0; i < temp.length(); i++){
                for(int j = i; j < str1.length(); j++){
                    for(int k = 0; k < str1.length(); k++){
                        if(str2.charAt(k) != temp.charAt(j))
                            break;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
    }
}
