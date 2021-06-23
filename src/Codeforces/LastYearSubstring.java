package Codeforces;

import java.util.Scanner;

public class LastYearSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean bool = false;
            for(int i = 0;i < n;i++){
                if(s.charAt(0) == '2' && s.charAt(n-3) == '0' && s.charAt(n-1) == '0' && s.charAt(n-2) == '2')
                    bool = true;
                if(s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(n-1) == '0' && s.charAt(n-2) == '2')
                    bool = true;
                if(s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(n-1) == '0')
                    bool = true;
                if(s.charAt(0) == '2' && s.charAt(1) == '0' && s.charAt(2) == '2' && s.charAt(3) == '0')
                    bool = true;
                if(s.charAt(n-4) == '2' && s.charAt(n-3) == '0' && s.charAt(n-1) == '0' && s.charAt(n-2) == '2')
                    bool = true;
            }
            if(bool)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
