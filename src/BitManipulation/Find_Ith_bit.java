package BitManipulation;

import java.util.*;
public class Find_Ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which u want to find the ith bit");
        int n = sc.nextInt();
        System.out.println("Enter the index of bit");
        int a = sc.nextInt();

        int b = 1<<(a-1); // creating a mask

        if((n&b) > 0){
            System.out.println("1");
        }
        else
            System.out.println("0");
    }
}
