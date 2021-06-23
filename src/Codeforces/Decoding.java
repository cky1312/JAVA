package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();

        if(n <= 2)
            System.out.println(s);
        else {
            ArrayList<Character> c = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                c.add(s.charAt(i));
            }
//            for(int i = 0 ; i<n;i++){
//                System.out.print(c.get(i));
//            }
            int size = c.size();
            System.out.println(size);
            while (size-- > 2) {
                if (size % 2 == 0) {
                    System.out.print(c.get((size % 2)-1));
                    c.remove((size % 2)-1);
                }
                else{
                    System.out.print(c.get((size % 2)));
                    c.remove((size % 2));
                }
            }
        }
    }
}
