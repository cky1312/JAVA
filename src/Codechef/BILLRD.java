package Codechef;

import java.util.*;
public class BILLRD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            if(x == y)
                System.out.println(n+" "+n);
            else if(x > y){
                long x1 = n;
                long y1 = n - x + y;
                long x2 = y1;
                long y2 = x1;
                long x3 = 0;
                long y3 = y2 - x2;
                long x4 = y3;
                long y4 = x3;

                if(k % 4 == 1)
                    System.out.println(x1+" "+y1);
                else if(k % 4 == 2)
                    System.out.println(x2+" "+y2);
                else if(k % 4 == 3)
                    System.out.println(x3+" "+y3);
                else
                    System.out.println(x4+" "+y4);
            }
            else{
                long x1 = n - y + x, y1 = n;
                long x2 = y1, y2 = x1;
                long x3 = x2 - y2, y3 = 0;
                long x4 = y3, y4 = x3;

                if(k % 4 == 1)
                    System.out.println(x1+" "+y1);
                else if(k % 4 == 2)
                    System.out.println(x2+" "+y2);
                else if(k % 4 == 3)
                    System.out.println(x3+" "+y3);
                else
                    System.out.println(x4+" "+y4);

            }
        }
    }
}
