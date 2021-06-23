package Codeforces;

import java.util.*;
public class WizardOfOrz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = 9;
            int b = 98;
            int c = 0;
            if(n == 1)
                System.out.println(a);
            else if(n == 2)
                System.out.println(b);
            else{
                System.out.print(b+""+a);
                for(int i = 1;i<=n-3;i++){
                    if(c == 10) {
                        c = 0;
                        System.out.print(c);
                        c++;
                    }
                    else{
                        System.out.print(c);
                        c++;
                    }
                }
            }
            System.out.println();
        }
    }
}
