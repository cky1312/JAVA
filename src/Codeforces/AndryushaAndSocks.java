package Codeforces;

import java.util.Scanner;

public class AndryushaAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[2*n];
        int count = 0, max = 0, a;
        for(int i=0;i<2*n;i++){
            a = sc.nextInt();
            arr[a]++;
            if(arr[a] == 2)
                count--;
            else
                count++;
            max = Math.max(max,count);
        }
        System.out.println(max);

    }
}
