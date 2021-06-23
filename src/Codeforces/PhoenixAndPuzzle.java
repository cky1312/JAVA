//package Codeforces;

import java.util.*;
public class PhoenixAndPuzzle {
    static boolean isPowerOfTwo(int n) {
        return (int) (Math.ceil((Math.log(n) / Math.log(2))))
                == (int) (Math.floor(((Math.log(n) / Math.log(2)))));
    }

    static boolean isPowerOf4(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

//                if((isPowerOf4(n) && n % 4 == 0) || (isPowerOfTwo(n) && n % 2 == 0))
//                    System.out.println("YES");
//                else
//                    System.out.println("NO");
            if ((n & 1) == 1)
                System.out.println("NO");
            else {
                for (long i = 1; i * i * 2 <= n; i++) {
                    if (i * i * 2 == n || i * i * 4 == n) {
                        System.out.println(("YES"));
//                        out.write(("\n").getBytes());
                    }
                    else
                        System.out.println("NO");
                }


//                out.write(("\n").getBytes());
            }
        }
    }
}
