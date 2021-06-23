package GFG_Strings;

import java.util.Scanner;

public class CheckForRotationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            System.out.println("Enter the String:");
            String str = sc.nextLine();
            System.out.println("Enter the String for checking that it is rotation of main String or not:");
            String pat = sc.nextLine();

            boolean tf = areRotations(str,pat);
            if(tf == true)
                System.out.println("Yes, the string is rotation of main String.");
            else

                System.out.println("No, the string is not the rotation of main String.");
        }
    }
    static boolean areRotations(String str, String pat){
        if(str.length() != pat.length())
            return false;
        return ((str + str).indexOf(pat) >= 0);
    }
}
