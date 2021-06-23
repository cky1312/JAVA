//package Codeforces;

import java.util.*;
public class SpaceNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            String s  =sc.next();

            int u = 0, d = 0, l = 0, r = 0;

            for (int i = 0; i < s.length();i++){
                if(s.charAt(i) == 'U')
                    u++;
                else if(s.charAt(i) == 'D')
                    d++;
                else if(s.charAt(i) == 'L')
                    l++;
                else
                    r++;
            }

            boolean cX = false, cY = false;
            if(x >= 0){
                if(x <= r)
                    cX = true;
            }
            else if(x < 0){
                if(Math.abs(x) <= l)
                    cX = true;
            }

            if(y >= 0){
                if(y <= u)
                    cY = true;
            }
            else if(y < 0){
                if(Math.abs(y) <= d)
                    cY = true;
            }

            if(cY && cX)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
