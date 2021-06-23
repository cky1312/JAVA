package GFG_Strings;

import java.util.Scanner;

public class LeftmostRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases:");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            System.out.println("Enter your String:");
            String str = sc.nextLine();

            System.out.println(leftMost(str));
        }
    }
    static final int CHAR = 256;
    static int leftMost(String str){
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)])
                res = i;
            else
                visited[str.charAt(i)] = true;
        }
        return res;
    }
}
