package Codechef;

import java.util.*;
public class SSCRIPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            String temp = "";
            for(int i = 0; i < k; i++)
                temp += "*";
//            System.out.println(temp);
//            StringBuilder temp = new StringBuilder();
//            temp.append("*".repeat(Math.max(0, k)));
            boolean flag = false;
            for(int i = 0; i < n - k; i++){
                if((s.substring(i,i+k)).equals(temp)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
