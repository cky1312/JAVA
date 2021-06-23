package GFG_Strings;

import java.util.Scanner;

public class Forming_LPS_Array_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int[] lps = new int[str.length()];
        longPropPreSuffix(str,lps);
        System.out.println("LPS array formed is:");
        for(int i=0;i<str.length();i++)
            System.out.print(lps[i]+" ");
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
