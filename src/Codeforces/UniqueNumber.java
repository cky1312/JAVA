package Codeforces;

import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int minAns = Integer.MAX_VALUE;
            int left = 1, right = n-1;
            String l1="",r1="";
            while(left < right){
                if(left + right == n){
                    l1 = String.valueOf(left);
                    r1 = String.valueOf(right);
                    String ss = l1+r1;
                    int minnnn = Integer.parseInt(ss);
                    minAns = Math.min(minAns,minnnn);
                }
                left++;
                right--;
            }
            if(minAns < Integer.MAX_VALUE){
                System.out.print(l1+r1);
            }
            else
                System.out.println("-1");
        }
    }
}
