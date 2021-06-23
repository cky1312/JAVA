package Codechef;

import java.util.*;
public class DECODEIT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();              // no of test cases
        while (t-- > 0){
            int n = sc.nextInt();          // length of the string
            String s = sc.next();          // encoded string

            char[] arr = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
            for(int i = 0; i < n;){
                int a = Integer.parseInt(s.substring(i,i+4),2);
                System.out.print(arr[a]);
                i += 4;
            }
            System.out.println();
        }
    }
}
