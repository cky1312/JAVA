package Codeforces;

import java.util.*;
public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int s3 = sc.nextInt();
//        int s4 = sc.nextInt();
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            int s = sc.nextInt();
            arr[i] = s;
        }
        Arrays.sort(arr);
        int c = 0;
        for(int i = 0; i < 3; i++){
            if(arr[i] == arr[i + 1])
                c++;
        }
        System.out.println(c);
    }
}
