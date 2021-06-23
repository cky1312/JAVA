package Codechef;

import java.util.*;
public class CHFNSWPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for(int i=0;i<n;i++){
                A[i] = sc.nextInt();
                B[i] = sc.nextInt();
            }
            Arrays.sort(A);
            Arrays.sort(B);
            
        }
    }
}
