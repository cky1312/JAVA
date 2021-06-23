package LinkedList;

import java.util.*;
public class ReverseLL {

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }


        static Node head;
        void addAtEnd(int x){
            Node temp = new Node(x);

            if(head == null){
                head = temp;
                return;
            }

            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }

        static void reverse(Node head){
            Node n, p = null, c = head;
            while(c != null){
                n = c.next;   // next = next node of current node
                c.next = p;   // making current of next = previous
                p = c;        // making previous = current
                c = n;        // making current = next
            }
            head = p;
            printLL(head);
        }

        static void printLL(Node head){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+"->");
                curr = curr.next;
            }
            System.out.print("NULL");
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Nodes : ");
        int n = sc.nextInt();
        ReverseLL ll = new ReverseLL();
        for(int i = 0; i < n; i++){
            ll.addAtEnd(sc.nextInt());
        }

        printLL(head);
        System.out.println();
        reverse(head);
    }
}
