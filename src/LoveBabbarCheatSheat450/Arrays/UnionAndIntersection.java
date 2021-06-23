// package LoveBabbarCheatSheat450.Arrays;

import java.util.*;

public class UnionAndIntersection {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();

                int[] a = new int[n];
                int[] b = new int[m];

                for (int i = 0; i < n; i++) {
                    a[i] = (sc.nextInt());
                }
                for (int i = 0; i < m; i++) {
                    b[i] = (sc.nextInt());
                }

                HashSet<Integer> h = new HashSet<>();

                for(int i = 0; i < n; i++){
                    h.add(a[i]);
                }

                for(int i = 0; i < m; i++){
                    h.add(b[i]);
                }
                System.out.println(h.size());
                for (int i : h) {
                    System.out.print(i+" ");
                }
            }
        }
        catch (Exception e){

        }
    }
}
