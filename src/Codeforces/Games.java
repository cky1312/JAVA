package Codeforces;

import java.util.*;
public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
            brr.add(sc.nextInt());
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr.get(i).equals(brr.get(j)) && i != j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
