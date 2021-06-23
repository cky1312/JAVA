package GFG_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            System.out.println("Enter your String:");
            String str = sc.nextLine();

            System.out.println("The non repeating leftmost character is at index: ");
            System.out.println(leftMostNonRepeating(str));
        }
    }
    static final int CHAR = 256;
    static int leftMostNonRepeating(String str){
        int[] fi = new int[CHAR];
        Arrays.fill(fi,-1);  // filling the array with -1
        for(int i=0;i<str.length();i++){
            if(fi[str.charAt(i)] == -1)   // if the character is appearing for first time
                fi[str.charAt(i)]= i;     // fill the index of that character
            else
                fi[str.charAt(i)] = -2;   // if the character is repeating then fill it with -2
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(fi[i]>=0)
                res = Math.min(res,fi[i]);
        }
        return(res == Integer.MAX_VALUE)?-1:res;
    }
}
