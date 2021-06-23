package Codeforces;

import java.util.*;
public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {4,7,44,47,74,77,444,447,477,744,747,777};
        boolean b = false;
        for(int i = 0; i < arr.length; i++){
            if(n%arr[i] == 0){
                b = true;
                break;
            }
        }
        if(b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
