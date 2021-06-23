import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();

        while(testcases-->0)
        {
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i=0;i<n;i++)
            {
                list.add(sc.nextInt());
            }

            for(int i=0;i<n;i++)
            {
                int val = Math.abs(list.get(i));

                if(list.get(val-1)>0)
                    list.set(val-1,-list.get(val-1));
                else System.out.print(val+" ");
            }

            for(int i=0;i<n;i++)
            {
                if(list.get(i)>0)
                    System.out.print(i+1+"\n");
            }
        }
    }
}