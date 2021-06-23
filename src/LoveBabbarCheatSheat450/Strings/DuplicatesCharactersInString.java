package LoveBabbarCheatSheat450.Strings;

import java.util.*;
public class DuplicatesCharactersInString {

    static void duplicates(String str){
        int l = str.length();
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0; i < l; i++){
            if (count.containsKey(str.charAt(i))){
                count.put(str.charAt(i), count.get(str.charAt(i))+1);
            }
            else {
                count.put(str.charAt(i),1);
            }
        }

        for(Map.Entry element : count.entrySet()){
            char k = (char)element.getKey();
            int val = (int)element.getValue();

            if(val > 1)
                System.out.println(k+" -> "+val);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        duplicates(str);
    }
}
