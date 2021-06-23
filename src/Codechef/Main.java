package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
        try {
            FastReader s = new FastReader();
            int t = s.nextInt();
            while(t-- > 0) {
                int n = s.nextInt();
                long X = s.nextLong();
                int p = s.nextInt();
                int k = s.nextInt();
                long[] arr = new long[n];
                int ss = 0, ls = 0, es = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();

                    if(arr[i] == X)
                        es++;
                    else if(arr[i] > X)
                        ls++;
                    else
                        ss++;
                }
                int a = 0;
                if(k <= ss && p <= ss){
                    if(p >= k){
                        a = ss + 1 - p;
                    }
                    if(p < k)
                        a = -1;
                }
                else if((ss+1) <= p && (ss+es) >= p){
                    a=0;
                }
                else if(k > (ss + es) && p > (ss+es)){
                    if(p>k)
                        a = -1;
                    if(p <= k)
                        a = (p - (ss + es));
                }
                else
                    a = -1;

                System.out.println(a);
            }
        }

        catch (Exception e){

        }
    }
}
