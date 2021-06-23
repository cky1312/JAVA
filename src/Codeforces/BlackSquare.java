package Codeforces;

import java.util.*;
public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        String s = sc.nextLine();

        int sum = 0;
        for(int i=0;i<s.length();i++){
            int a =Integer.parseInt(String.valueOf(s.charAt(i))) ;
            //System.out.println(a);
            sum = sum + arr[a-1];
        }
        System.out.println(sum);
    }
}
