package Codeforces;

import java.util.*;
public class BovineDilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr  = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            HashSet<Double> h = new HashSet<>(n);
            double hyp,base;
            for(int i = 0; i < n; i++){
                for(int j = i+1; j < n; j++){
                    base = arr[j] - arr[i];
                    hyp = calHypo(base);
                    h.add(area(base,hyp,1));
                }
            }
            System.out.println(h.size());
        }
    }
    static double calHypo(double b){
        double p = 1,hy;
        hy = Math.sqrt(p*p + b*b);
        return hy;
    }
    static double area(double b, double hy,double p){
        double s = (b+hy+p)/2;
        double ar = Math.sqrt(s*(s-b)*(s-hy)*(s-p));
        return ar;
    }
}
