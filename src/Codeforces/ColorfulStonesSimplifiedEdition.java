package Codeforces;

import java.util.*;
public class ColorfulStonesSimplifiedEdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int c = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(c)){
                c++;
            }
        }
        System.out.println(c+1);
    }
}
