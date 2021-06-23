package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayList {
    private static Object List;

    public static void main(String[] args) {
        String[] wordArray = {"level","Ada","Kayak","Bob","Rotator","Bob"};
        
        System.out.println("(1) Create an empty list of Strings: ");
        List<String> strList = new ArrayList<>();
        //printListWithIndex(strList);
        System.out.println(strList);
        
        System.out.println("\n(2) Add elements to list: ");
        for(String str : wordArray){
            strList.add(str);
            //printListWithIndex(strList);
            System.out.println(strList);
        }
        System.out.println("Insert an element at index 2 in the list: ");
        strList.add(2,"Java");
        //printListWithIndex(strList);
        System.out.println(strList);
        
        System.out.println("\n(3) Replace the element at index 1: ");
        String oldElement = strList.set(1,"Naan");
        System.out.println("Element that was replaced: "+oldElement);
        //printListWithIndex(strList);
        System.out.println(strList);
        
        System.out.println("\n(4) Remove the element at index 0: ");
        System.out.println("Element removed: "+ strList.remove(0));
        //printListWithIndex(strList);
        System.out.println(strList);
        
        System.out.println("\n(5) Remove the first occurence of \"Java\": ");
        System.out.println("Element removed: "+ strList.remove("Java"));
        //printListWithIndex(strList);
        System.out.println(strList);
        
        System.out.println("\n(6) Determine the size of the list: ");
        System.out.println("The size of the list is "+ strList.size());
        
        System.out.println("\n(7) Determine if the list is empty: ");
        boolean result = strList.isEmpty();
        System.out.println("The list " + (result ? "is" : "is not") + " empty.");
        
        System.out.println("\n(8) Get the element at specific index: ");
        System.out.println("InorderTraversal element: "+strList.get(0));
        System.out.println("Last element: "+strList.get(strList.size()-1));
        
        System.out.println("\n(9) Compare two lists: ");
        List<String>stringList2 = new ArrayList<>(strList);
        boolean trueOrFalse = strList.equals(stringList2);
        System.out.println("The lists strList and strList2 are "+(trueOrFalse ? "" : "not")+" equal.");
        stringList2.add(null);
        //printListWithIndex(stringList2);
        System.out.println(strList);
        trueOrFalse = strList.equals(stringList2);
        System.out.println("The lists strList and strList2 are "+(trueOrFalse ? "" : "not")+" equal.");
        
        System.out.println("\n(10) Membership test: ");
        boolean found = strList.contains("Naan");
        String msg = found ? "contains" : "does not contain";
        System.out.println("The list "+ msg + " the string \"Naan\".");
        
        //System.out.println("\n(11) Find the index of an element: ");
//        public static <E> void printListWithIndex(List<E> list);
//            List<String> newList = new ArrayList<>();
//            for(int i=0;i<list.size();i++){
//                newList.add(i+":"+list.get(i));
//            }
//            System.out.println(newList);
    }
}
