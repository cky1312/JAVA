package Codechef;
import java.util.*;
class CHEFSTR1 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long arr[] = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                long sum = 0;
                for (int i = 0; i < n - 1; i++) {
                    sum = sum + Math.abs(arr[i] - arr[i + 1]) - 1;
                }
                System.out.println(sum);
            }
        }
        catch (Exception e) {

        }
    }
}
