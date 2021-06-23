package Codechef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class XOR_Comp {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        try{
            FastReader s = new FastReader();
            int t = s.nextInt();
            while (t-- > 0) {
                long x = s.nextLong();
                long y = s.nextLong();
                long n = s.nextLong();

                long sum = 0;
                for(long i = 0; i < n; i++){
                    if((x^i) < (y^i))
                        sum++;
                }
                System.out.println(sum);
            }
        }
        catch(Exception e){

        }
    }
}
