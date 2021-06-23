import java.util.*;
public class Codeforce
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> obj = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            obj.add(sc.nextInt());
        }
        int s = 0, s1 = 0;
        for (int i = 0; i < n; i++) {
           /* s = s + Collections.max(obj);
            obj.remove(Collections.max(obj));

            s1 = s1 + Collections.max(obj);
            obj.remove(Collections.max(obj));*/
            if ( i % 2 == 0) {
                if (obj.get(0) > obj.get(obj.size() - 1)) {
                    s = s + obj.get(0);
                    obj.remove(0);
                } else {
                    s = s + obj.get(obj.size() - 1);
                    obj.remove(obj.size() - 1);
                }
            } else {
                if (obj.get(0) > obj.get(obj.size() - 1)) {
                    s1 = s1 + obj.get(0);
                    obj.remove(0);
                } else {
                    s1 = s1 + obj.get(obj.size() - 1);
                    obj.remove(obj.size() - 1);
                }

            }
        }
        System.out.println(s + " " + s1);
    }
}
