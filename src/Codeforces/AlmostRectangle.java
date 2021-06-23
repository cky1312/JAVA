//  package Codeforces;
//public class AlmostRectangle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            sc.nextLine();
//            char[][] arr = new char[n][n];
//            int fr = 0, fj = 0, lr = 0, lj = 0;
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextLine().toCharArray();
//            }
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (arr[i][j] == '*') {
//                        if (fr == 0 && fj == 0) {
//                            fr = i;
//                            fj = j;
//                        } else {
//                            lr = i;
//                            lj = j;
//                        }
//                    }
//                }
//            }
////            ..*.
////            ....
////            *...
////            ....
//            if (fj == n - 1 && lj == n - 1) {
//                arr[fr][fj - 1] = '*';
//                arr[lr][lj - 1] = '*';
//            } else if (fj == lj) {
//                arr[fr][fj + 1] = '*';
//                arr[lr][lj + 1] = '*';
//            } else if (fr == n - 1 && lr == n - 1) {
//                arr[fr - 1][fj] = '*';
//                arr[lr - 1][lj] = '*';
//            } else if (fr == lr) {
//                arr[fr + 1][fj] = '*';
//                arr[lr + 1][lj] = '*';
//            } else {
//                arr[lr][fj] = '*';
//                arr[fr][lj] = '*';
//            }
////            System.out.println(fr+" "+fj+" "+lr+" "+lj);
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++)
//                    System.out.print(arr[i][j]);
//                System.out.println();
//            }
//
//        }
//    }
//}

import java.util.*;
import java.lang.*;
import java.io.*;

public class AlmostRectangle {
    static final boolean multipleTestCase = true;

    public static void main(String[] args) throws Exception {
        try {
            FastReader fr = new FastReader();
            int t = multipleTestCase ? fr.nextInt() : 1;
            while (t-- > 0) {
                int n = fr.nextInt();
                char[][] arr = new char[n][n];
                for (int i = 0; i < n; i++) {
                    arr[i] = fr.nextLine().toCharArray();
                }
                int a = -1, b = -1, p = -1, q = -1;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (arr[i][j] == '*') {
                            if (a == -1) {
                                a = i;
                                b = j;
                            } else {
                                p = i;
                                q = j;
                                break;
                            }
                        }
                    }
                }
                /*
                 * Same row*/
                if (a == p) {
                    if (a + 1 < n) {
                        arr[a + 1][b] = '*';
                        arr[p + 1][q] = '*';
                    } else {
                        arr[a - 1][b] = '*';
                        arr[p - 1][q] = '*';
                    }
                }
                /*
                 * Same columns*/
                else if (b == q) {
                    if (b + 1 < n) {
                        arr[a][b + 1] = '*';
                        arr[p][q + 1] = '*';
                    } else {
                        arr[a][b - 1] = '*';
                        arr[p][q - 1] = '*';
                    }
                } else {
                    arr[a][q] = '*';
                    arr[p][b] = '*';
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(new String(arr[i]));
                }
            }
        } catch (Exception e) {
        } finally {
        }
    }

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
}