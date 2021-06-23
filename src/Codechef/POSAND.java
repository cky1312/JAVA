package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class POSAND
{
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    static boolean isPowerOfTwo(long n)
    {
        if (n == 0)
            return false;
        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args)
    {
        try {
            FastReader sc = new FastReader();
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextInt();
                if(n == 1)
                    System.out.println("1");

                else if(isPowerOfTwo(n))
                    System.out.println("-1");
                else{
                    System.out.print("2 3 1 ");
                    for(long i=4;i<=n;i++){
                        if(isPowerOfTwo(i)){
                            System.out.print(i+1+" ");
                            System.out.print(i+" ");
                            i++;
                        }
                        else{
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
        catch (Exception e){
            
        }
    }
}

