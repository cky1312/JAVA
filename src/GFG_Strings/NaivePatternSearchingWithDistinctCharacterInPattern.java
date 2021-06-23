package GFG_Strings;

import java.util.Scanner;

public class NaivePatternSearchingWithDistinctCharacterInPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            System.out.println("Enter the String:");
            String text = sc.nextLine();
            System.out.println("Enter the pattern:");
            String pat = sc.nextLine();
            System.out.println("The pattern is found at index:");

            patternSearching(text,pat);
        }
    }
    static void patternSearching(String text,String pat){
        int n = text.length();
        int m = pat.length();
        for(int i=0;i <= n-m;){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j) != text.charAt(i+j))
                    break;
            }
            if(j == m)
                System.out.print(i+" ");
            if(j == 0)
                i++;
            else
                i = i+j;
        }
    }
}
