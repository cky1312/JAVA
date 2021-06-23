package LinkedList;


public class MiddleofLinkedList {
    public static void main(String[] args) {
        lList l = new lList();
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.insertAtEnd(60);
        System.out.println("The formed Linked List is:");
        l.printList();
        System.out.println();
        System.out.println("The middle node is:");
        l.printMiddle();
        System.out.println();

    }
}
class node{
    int data;
    node next;
    node(int d){
        data = d;
    }
}
class lList{
    node head;
    void insertAtEnd(int x){
        node temp = new node(x);
        if(head == null){
            head = temp;
            return;
        }
        node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = temp;
    }
    void printList(){
        node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }
    void printMiddle(){
        if(head == null)
            return;
        node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}