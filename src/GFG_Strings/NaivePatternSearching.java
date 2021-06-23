package GFG_Strings;

import java.util.Scanner;

public class NaivePatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            System.out.println("Enter the String:");
            String txt = sc.nextLine();
            System.out.println("Enter the pattern:");
            String pat = sc.nextLine();
            //sc.next();
            System.out.println("The pattern is found at index:");
            patternSearching(txt,pat);
        }
    }
    static void patternSearching(String txt,String pat){
        int n = txt.length();
        int m = pat.length();
        for(int i=0;i <= (n-m);i++){
            int j;
            for(j=0;j<m;j++){
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            }
            if(j == m)
                System.out.print(i+" ");
        }
    }
}
