package Codechef;
import java.util.*;
public class SWAP10HG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println((n & 1) == 0 ? "Even" : "Odd");
            String s = sc.next();
            String p = sc.next();
            int countZeroS = 0;
            int countOneS = 0;

            for(int i = 0; i < n;i++){
                if(s.charAt(i) == '0')
                    countZeroS++;
                else
                    countOneS++;

                if(p.charAt(i) == '0')
                    countZeroS--;
                else
                    countOneS--;
            }

            if(countOneS == 0 && countZeroS == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
