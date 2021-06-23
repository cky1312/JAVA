package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class POSPREFS {
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
                catch (IOException e)
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
    public static void main(String[] args) {
        Main.FastReader sc = new Main.FastReader();

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n+1];

            for(int i = 1; i <= n; i++){
                arr[i] = -(i);
            }

            if(k == 1){
                arr[1] = -(arr[1]);
                for(int i = 1; i <= n; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

            else if(k == 2){
                arr[1] = -(arr[1]);
                arr[2] = -(arr[2]);
                for(int i = 1; i <= n; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }

            else if(k == n){
                for(int i = 1; i <= n; i++){
                    System.out.print((-(arr[i]))+" ");
                }
                System.out.println();
            }

            else{
                arr[1] = -(arr[1]);
                arr[2] = -(arr[2]);

                int k2 = k-2, j = 4;

                while(k2 != 0 && j <= n){
                    arr[j] = -(arr[j]);
                    k2--;
                    j += 2;
                }

                if(k2 > 0){
                    for(int i = n; i >= 1; i--){
                        if(arr[i] < 0){
                            arr[i] = -(arr[i]);
                            k2--;
                        }

                        if(k2 == 0){
                            break;
                        }
                    }

                    for(int l = 1; l <= n; l++){
                        System.out.print(arr[l]+" ");
                    }
                    System.out.println();
                }
                else{
                    for(int l = 1; l <= n; l++){
                        System.out.print(arr[l]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
