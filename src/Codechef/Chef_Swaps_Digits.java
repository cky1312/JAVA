package Codechef;

import java.util.Scanner;

public class Chef_Swaps_Digits {
     static int swap(int a, int b){
         int sum=0,sum1=0,sum2;

        while(a>0){
            sum = sum * 10 + a%10;
            a=a/10;
        }
        while(b>0){
            sum1 = sum1 *10 + b%10;
            b=b/10;
        }
        sum2=sum+sum1;
        return sum2;
    }
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = A+B;
                if(C>= swap(A,B))
                    System.out.println(C);
                System.out.println(swap(A,B));

            }
        }
        catch(Exception ignored){

        }
    }
}
