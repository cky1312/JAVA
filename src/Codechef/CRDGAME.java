package Codechef;

import java.util.*;
public class CRDGAME {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] arr = new long[n];
                long[] brr = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    brr[i] = sc.nextInt();

                }
//                for (int i = 0; i < n; i++) {
//                    brr[i] = sc.nextInt();
//                }
                int chef = 0, monty = 0;

                for (int i = 0; i < n; i++) {
                    long sum = 0, sum1 = 0;
                    long ar = arr[i];
                    long br = brr[i];
                    while (ar > 0) {
                        long r = ar % 10;
                        sum = sum + r;
                        ar = ar / 10;
                    }
                    //System.out.println("Sum "+sum);
                    while (br > 0) {
                        long r1 = br % 10;
                        sum1 = sum1 + r1;
                        br = br / 10;
                    }
                    //System.out.println("Sum1 "+sum1);
                    if (sum > sum1)
                        chef++;
                    else if (sum < sum1)
                        monty++;
                    else {
                        chef++;
                        monty++;
                    }
                }
                if (chef > monty)
                    System.out.println("0" + " " + chef);
                else if (chef < monty)
                    System.out.println("1" + " " + monty);
                else
                    System.out.println("2" + " " + monty);
            }
        }
        catch (Exception e){

        }
    }
}
