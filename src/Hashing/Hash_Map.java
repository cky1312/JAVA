package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String,Integer>h = new HashMap<>();
        h.put("gfg",15);
        h.put("courses",20);
        h.put("ide",30);
        System.out.println(h);
        System.out.println(h.size());

        for(Map.Entry<String,Integer> e : h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        if(h.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(h.remove("ide"));  // remove() function returns the value of removed key
        //h.remove("ide");
        System.out.println(h.size());

        if(h.containsKey("ide"))
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(h.get("courses"));
    }
}
