package BitManipulation;


//Find the only non-repeating element in an array where every elements repeats twice

import java.util.*;
public class Only_non_Repeating_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array.");
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
        System.out.println(res);
    }
}
