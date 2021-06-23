package Hackerrank;

import java.util.*;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int hour = Integer.parseInt(time.substring(0,2))%12;
        System.out.println(hour);

        if(time.contains("PM"))
            hour = hour + 12;
        System.out.println(hour);
        System.out.printf("%02d%s",hour,time.substring(2,8));
    }
}
