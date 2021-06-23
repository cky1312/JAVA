package BitManipulation;
import java.util.*;
public class Clear_ith_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose ith bit u wanted to clear");
        int n = sc.nextInt();
        int t = n;
        System.out.println("Enter the index of bit");
        int i = sc.nextInt();
        int tt = i;

        i = 1 << (i-1);  // creating a mask
        i = ~i;

        n = (n&i);

        if(t != n)
            System.out.println("After clearing the ith bit n = "+n);
        else
            System.out.println("The bit no "+tt+" is already clear");
    }
}
