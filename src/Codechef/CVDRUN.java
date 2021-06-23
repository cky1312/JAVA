package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CVDRUN {
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
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();    //no. of cities
            int k = s.nextInt();    //size of jump
            int x = s.nextInt();    //Covid's current city
            int y = s.nextInt();    //the city that you live in
            int[] arr = new int[n];
//            for(int i=0;i<n;i++){
//                System.out.print(arr[i]);
//            }
            int i = x;
//            int i=0;
            while(true){
                if(i==y && arr[i]!=-1){
                    System.out.println("YES");
                    break;
                }
                if(arr[i] != -1){
                    arr[i] = -1;
                    i=(k+x)%n;
                    x=i;
                }
                else {
                    if (arr[i] == -1) {
                        System.out.println("NO");
                        break;
                    }
                    if(i==y && arr[i]!=-1){
                        System.out.println("YES");
                        break;
                    }
                }

            }
        }
    }
}
