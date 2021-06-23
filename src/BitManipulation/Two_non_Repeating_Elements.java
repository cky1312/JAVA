package BitManipulation;

//Find the two non-repeating elements in an array where every elements repeats twice

import java.util.*;
public class Two_non_Repeating_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array. ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array.");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= arr[i];
        }
        int temp = res&-res;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if((arr[i] & temp) != 0)
                a ^= arr[i];
            else
                b ^= arr[i];

        }

        System.out.println(a+" "+b);
    }
}
