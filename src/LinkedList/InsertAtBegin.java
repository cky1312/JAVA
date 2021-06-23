package LinkedList;

public class InsertAtBegin {
    public static void main(String[] args) {
        List l = new List();
        l.insertAtBegin(20);
        l.insertAtBegin(15);
        l.insertAtBegin(10);
        l.printList();
        System.out.println();
        l.insertAtEnd(40);
        l.insertAtEnd(45);
        l.insertAtEnd(50);
        l.printList();
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}
class List{
    Node head;
    void insertAtBegin(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }
    void insertAtEnd(int x){
        Node temp = new Node(x);
        if(head == null){
            head = temp;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = temp;
    }
    void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("NULL");
    }

}