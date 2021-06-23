package LinkedList;

import java.util.*;
public class FoldingLL {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    void addAtEnd(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }

    static Node reverse(Node head){
        Node n, p = null, c = head;
        while(c != null){
            n = c.next;   // next = next node of current node
            c.next = p;   // making current of next = previous
            p = c;        // making previous = current
            c = n;        // making current = next
        }
        return p;
    }
    static void foldLL(Node head){
        if(head == null || head.next == null)
            return;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node nHead = mid.next;
        slow.next = null;
//        print(head);
        nHead = reverse(nHead);
//        System.out.println();
//        print(rHead);
        Node first = head, second = nHead;
        Node temp1 = null, temp2 = null;

        while (second != null){
            // backup
            temp1 = first.next;
            temp2 = second.next;

            // linking
            first.next = second;
            second.next = temp1;

            //shift
            first = temp1;
            second = temp2;

        }
        print(head);
    }
    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to add.");
        int n = sc.nextInt();
        FoldingLL l = new FoldingLL();

        for(int i = 0; i < n; i++){
            l.addAtEnd(sc.nextInt());
        }
        print(head);
        foldLL(head);
    }

}
