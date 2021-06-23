package Codeforces;

import java.util.Scanner;

public class KidsSeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int last = 4*n;
            for(int i=0;i<n;i++) {
                System.out.print(last+" ");
                last -= 2;
            }
            System.out.println();
        }
    }
}
