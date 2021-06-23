package Codeforces;

import java.util.*;
public class AddAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int minSteps = 0;

            while (a != 0){
                if(a > b) {
                    a /= b;
                }
                else{
                    b++;
                }
                minSteps++;
            }
            System.out.println(minSteps);
        }
    }
}
