package Codeforces;

import java.util.Scanner;

public class HungryStudentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();

            if(x == 4 || x == 5 || x == 8 || x == 11 || x < 3)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
