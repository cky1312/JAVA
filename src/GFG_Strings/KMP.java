package GFG_Strings;

import java.util.Scanner;

public class KMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enter the Pattern:");
        String pat = sc.nextLine();
        System.out.println("The pattern is present at index:");
        kmp(str,pat);
    }
    static void kmp(String str,String pat){
        int n = str.length();
        int m = pat.length();
        int[] lps = new int[m];
        longPropPreSuffix( pat,lps);
        int i=0,j=0;
        while(i<n){
            if(pat.charAt(j) == str.charAt(i))
                i++;j++;
            if(j == m){
                System.out.println(i-j);
                j = lps[j-1];
            }
            else if(i < n && pat.charAt(j) != str.charAt(i)){
                if(j == 0)
                    i++;
                else
                    j = lps[j-1];
            }
        }
    }
    static void longPropPreSuffix(String str, int[] lps){
        int n = str.length(),len=0;
        lps[0] = 0;
        int i=1;
        while(i<n){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len == 0){
                    lps[i]=0;
                    i++;
                }
                else
                    len = lps[len-1];
            }
        }
    }
}
