package GFG_Strings;

import java.util.Scanner;

public class Forming_LPS_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int[] lps = new int[str.length()];
        fillLPS(str,lps);
        System.out.println("LPS array is:");
        for(int i=0;i<str.length();i++)
            System.out.print(lps[i]+" ");
    }
    static void fillLPS(String str, int[] lps){
        for(int i=0;i<str.length();i++){
            lps[i] = longPropPreSuffix(str,i+1);
        }
    }
    static int longPropPreSuffix(String str, int n){
        for(int len = n-1;len>0;len--){
            boolean flag = true;
            for(int i=0;i<len;i++){
                if (str.charAt(i) != str.charAt(n - len + i)) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                return len;
        }
        return 0;
    }
}
