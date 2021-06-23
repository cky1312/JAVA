package Codechef;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PASSWD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.next();
        while (t-- > 0){
            String str = sc.nextLine();

            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#%&?])"
                    + "(?=\\S+$).{10}$";

            Pattern p = Pattern.compile(regex);

            if(str == null){
                System.out.println("No");
            }

            else{
                Matcher m = p.matcher(str);
                if(m.matches())
                    System.out.println("Yes");
                else
                    System.out.println("NO");
            }
        }
    }
}
