package Codeforces;

import java.util.*;
public class YetAnotherCardDeck {
    static void shift(int[] an, int i){
        int a = an[i];
        for(int j = i; j > 0; j--){
            an[j] = an[j-1];
        }
        an[0] = a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();

        int[] an = new int[n];
        for(int i = 0; i < n; i++)
            an[i]  = sc.nextInt();

        int[] aq = new int[q];
        for(int i = 0; i < q; i++)
            aq[i]  = sc.nextInt();

        int qq = 0;
        while(qq < q){
            for(int i = 0; i < n; i++){
                if(an[i] == aq[qq]){
                    System.out.print((i+1)+" ");

                    shift(an,i);
//                    for (int k:an
//                    ) {
//                        System.out.print(k+" ");
//                    }
//                    System.out.println();
                    break;
                }
            }
            qq++;
        }
    }
}
