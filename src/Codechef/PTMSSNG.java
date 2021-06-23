package Codechef;

import java.util.*;
public class PTMSSNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int n = 4*N-1;
            int[] ax = new int[n];
            int[] ay = new int[n];
            for(int i=0;i<n;i++){
                ax[i] = sc.nextInt();
                ay[i] = sc.nextInt();
            }
            int x=0,y=0;
            for(int i=0;i<n;i++){
                x ^= ax[i];
                y ^= ay[i];
            }
            System.out.println(x+" "+y);
        }
    }
}
