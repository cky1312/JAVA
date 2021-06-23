package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position from last:");
        int n = sc.nextInt();
        LinkedList<Integer>ll = new LinkedList<>();
        ll.add(45);
        ll.add(85);
        ll.add(85);
        ll.add(2,56);
        System.out.println(ll);
        for (Integer integer : ll) {
            System.out.print(integer + "->");
        }
        System.out.println("Null");
        int l = ll.size();
        System.out.println(l);
        System.out.println(ll.get(l-n));
    }
}
