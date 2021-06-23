package Codeforces;

import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();

            int l = s.length();
            boolean f = false;
            if(s.charAt(0) == ')' || s.charAt(l-1) == '(')
                f = true;

            int count = 0;
            for(int i = 0; i < l; i++){
                if(s.charAt(i) == '?')
                    count++;
            }

            if((count & 1) == 0 && !f)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
