package Codeforces;

import java.util.*;
public class NewYearNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            if(n % 2021 == 0)
                System.out.println("Yes");
            else{
                boolean b = false;
                int i = 0;
                while(n - (2021 * i) >= 0) {
                    if (((n - (2021 * i)) % 2020) == 0) {
                        b = true;
                        break;
                    }
                    i++;
                }
                if (b)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
