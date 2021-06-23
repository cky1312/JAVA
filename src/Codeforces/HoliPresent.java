package Codeforces;

import java.util.*;
public class HoliPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String str = sc.next();
        if(l % 2 != 0)
            System.out.println("No");
        else if(str.charAt(0) == ')' && str.charAt(1) == ')')
            System.out.println("No");
        else{
            int c1 = 0, c2 = 0;
            Stack<Character> c = new Stack<>();
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '(')
                    c.push(str.charAt(i));
                else if(c.size()!=0){
                    c.pop();
                }
            }
            if(c.empty() || c.size() == 1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
