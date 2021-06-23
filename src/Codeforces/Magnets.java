package Codeforces;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count = 1;
        int ar[] = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(ar[i] != ar[i+1])
                count++;
        }
        System.out.println(count);
    }
}
