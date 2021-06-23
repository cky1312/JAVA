package GFG_Strings;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class CodechefAugust_KMP {
    public static void solve () throws IOException
    {
        try {
            //Scanner sc=new Scanner(System.in);
            //FastReader sc=new FastReader();
            //Reader sc=new Reader();
            int t=scanInt();
            while(t-->0)
            {
                String p=scanString();
                String s=scanString();
                List<Character> al = new ArrayList<Character>();
                for(int i=0;i<p.length();i++)
                {
                    al.add(p.charAt(i));
                }
                char small=s.charAt(0);
                for(int i=0;i<s.length();i++)
                {
                    char f=s.charAt(i);
                    al.remove(new Character(f));

                }
                for(int i=1;i<s.length();i++)
                {
                    if(small!=s.charAt(i))
                    {
                        small=s.charAt(i);
                        break;
                    }
                }
                // System.out.println(al);
                //Collections.sort(al);
                char[] ch1 =new char[p.length()-s.length()];
                int m=0;
                String res="",gro="";
                for(char ch:al)
                {
                    ch1[m]=ch;
                    m++;
                }


                Arrays.sort(ch1);
                res=String.valueOf(ch1);
                //System.out.println(res);
                //int fo=0;
                boolean fin=false;
                for(int i=0;i<res.length();i++)
                {
                    if(res.charAt(i)>s.charAt(0))
                    {
                        out.println(s+res.substring(i,res.length()));
                        fin=true;
                        break;
                    }
                    else if(res.charAt(i)==s.charAt(0))
                    {
                        if(res.charAt(i)>=small)
                        {
                            out.println(s+res.substring(i,res.length()));
                            fin=true;
                            break;
                        }
                        else if(res.charAt(i)<small)
                            out.print(res.charAt(i));

                    }
                    else
                    {
                        out.print(res.charAt(i));

                    }
                }
                if(!fin)
                    out.println(s);




            }
        } catch(Exception ignored) {
        }
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
