package BitManipulation;

import java.util.*;
public class Set_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose ith bit u want to set");
        int n = sc.nextInt();
        int t = n;
        System.out.println("Enter the index which u want to set");
        int i = sc.nextInt();
        int tt = i;

        i = 1<<(i-1); // creating a mask

        n = n|i;

        if(t != n)
            System.out.println("n after setting the ith bit "+n);
        else
            System.out.println("The bit no "+tt+" is already set");
    }
}
