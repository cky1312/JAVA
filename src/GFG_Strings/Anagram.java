package GFG_Strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            System.out.println("Enter your first String:");
            String s1 = sc.nextLine();
            System.out.println("Enter your second String:");
            String s2 = sc.nextLine();

            System.out.println(anagram(s1,s2));
        }
    }
    static final int CHAR = 256;
    static boolean anagram(String s1,String s2){
        if(s1.length() != s2.length())
            return false;
        int[] count = new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}
