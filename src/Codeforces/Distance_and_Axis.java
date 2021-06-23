package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Distance_and_Axis {
    public static void main(String[] args) {
        Scanner fr = new Scanner(System.in);

        PrintWriter out = new PrintWriter(System.out);

        int testcases = fr.nextInt();

        while (testcases-->0)
        {
            int n = fr.nextInt();
            int k = fr.nextInt();

            if (k == 0)
            {
                if (n%2==0) out.println(0);
                else out.println(1);
            }
            else
            {
                if(n==0) out.println(k);
                else
                {
                    out.println(Math.min(Math.abs(n-k),n));
                }
            }
        }

        out.flush();
        out.close();
    }
}
