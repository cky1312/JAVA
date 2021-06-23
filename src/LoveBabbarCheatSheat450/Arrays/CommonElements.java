package LoveBabbarCheatSheat450.Arrays;

import java.util.*;
public class CommonElements {
    static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3){
        ArrayList<Integer> ar = new ArrayList<>();
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for (int i : arr2) {
            if(!h1.containsKey(i))
                h1.put(i,0);
            else
                h1.put(i,h1.get(i)+1);
        }
        HashMap<Integer,Integer> h2 = new HashMap<>();
        for (int i : arr3) {
            if(!h2.containsKey(i))
                h2.put(i,0);
            h2.put(i,h2.get(i)+1);
        }
        for (int i : arr1) {
            if(h1.containsKey(i) && h2.containsKey(i))
                ar.add(i);
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];
        for(int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        for(int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        for(int i = 0; i < n3; i++)
            arr3[i] = sc.nextInt();

        ArrayList<Integer> ar = commonElements(arr1, arr2, arr3);
        for (int i : ar) {
            System.out.print(i+" ");
        }

    }
}
