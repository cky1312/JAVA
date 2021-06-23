/*
*Equilibrium Array
 */
/*import java.util.*;
public class Linked
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int first = sc.nextInt();
            int last = sc.nextInt();
            int c;
            for(int i=first;i<=last;i++)
             {
                 c=1;
                 if(i==1 || i==0)
                     continue;
                for(int k=2;k<=i/2;k++)
                {
                    if(i%k==0)
                    {
                        c = 0;
                        break;
                    }
                }
                if(c==1)
                    System.out.println(i);
             }
        }

    }
}

import java.util.*;

class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c;
        for(int i=0;i<=n;i++)
        {
            c=1;
            if(i==0 || i==1)
                continue;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                    c=0;
            }
            if(c==1)
                System.out.print(i+" ");
        }
    }
}


import java.util.*;
class Pintu_and_Fruits{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int ar[] = new int[n];
                int br[] = new int[n];
                for (int j = 0; j < n; j++) {
                    ar[j] = sc.nextInt();
                }
                for (int j = 0; j < n; j++) {
                    br[j] = sc.nextInt();
                }
                int v = -1, s = 999999, sum = 0;
                for (int j = 0; j < n; j++) {
                    if (ar[j] != v) {
                        sum = br[j];
                        for (int k = j + 1; k < n; k++) {

                            if (ar[j] == ar[k]) {
                                sum += br[k];
                                ar[k] = v;
                            }
                        }


//                else
//                    continue;
                        if (s > sum) {
                            s = sum;
                        }
                    }
                   // System.out.print(s + " ");
                }
                System.out.println(s);
            }
        }
        catch(Exception e){

        }
    }
}


import java.util.*;
class XOR_Engine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int q = sc.nextInt(),a,c;
            int ar[] = new int[n];
            int p[] = new int[q];
            String s = "";
            String s1 = "";
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<n;j++){
                ar[j] = sc.nextInt();
            }
            for(int j=0;j<q;j++) {
                p[j] = sc.nextInt();
            }

            for(int k=0;k<q;k++){
                int b = p[k];
                while(b>0){
                    a=b%2;
                    s=s+a;
                    b=b/2;
                }
                for(int l=0;l<n;l++){

                    while(ar[l]>0){
                        c=ar[l]%2;
                        s1=s1+c;
                        ar[l]=ar[l]/2;
                    }
                    for(int m=0;m<s.length();m++){
                        sb.append(s.charAt(m) ^ s1.charAt(m));
                    }
                }
                for(int bi=0;bi<sb.length();bi++){
                    if(sb.charAt(bi)==1){

                    }
                        
                }
            }
        }
    }
}

 */
class abc{
    public static void main(String[] args){
        int a=2,b=3;
        int c=a^b;
        System.out.println(c);
    }
}