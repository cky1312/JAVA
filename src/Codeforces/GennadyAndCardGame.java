package Codeforces;

import java.util.Scanner;

public class GennadyAndCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String table = sc.next();

        int count = 0;
        for(int i = 0; i < 5; i++){
            String hand = sc.next();
            if(hand.charAt(0) == table.charAt(0) || hand.charAt(1) == table.charAt(1)){
                count++;
            }
        }

        if(count > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
