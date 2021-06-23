package LoveBabbarCheatSheat450.LinkedList;

//import java.util.*;
public class ReverseLL {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverseLL(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    static void printLL(Node head){
        while (head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(6);
        list.head.next.next.next = new Node(7);
        list.head.next.next.next.next = new Node(8);
        list.head.next.next.next.next.next = new Node(9);
        list.head.next.next.next.next.next.next = new Node(10);

        System.out.println("LinkedList before reversal");
        list.printLL(list.head);
        System.out.println("null");
        list.head = list.reverseLL(list.head);
        System.out.println();
        System.out.println("LinkedList after reversal");
        list.printLL(list.head);
        System.out.println("null");
    }
}
