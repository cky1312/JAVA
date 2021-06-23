package Hashing;

import java.util.*;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String>h = new HashSet<>();
        h.add("gfg");
        h.add("courses");
        h.add("ide");
        System.out.println(h);

        System.out.println(h.contains("ide"));

        for (String value : h) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(h.size());         // prints the size of the hash table

        h.remove("ide");                   // remove the particular object from the hash table

        for(String s : h)
            System.out.print(s+" ");
        System.out.println();
        System.out.println(h.isEmpty());    // return true if the hash table is empty otherwise it returns false
        System.out.println(h.size());
        h.clear();                          // clears the hash table
        System.out.println(h.size());
    }
}
