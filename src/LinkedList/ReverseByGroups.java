package LinkedList;

public class ReverseByGroups {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
    
    static class list{
        static Node head;
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
        void printLinkedList(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+"->");
                curr = curr.next;
            }
            System.out.print("NULL");
        }
        Node reverse(int k){
            Node curr = list.head, next = null, prev = null;
            int count = 0;
            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(next != null){
                head.next = reverse(k);
            }
            return prev;
        }
    }
    public static void main(String[] args) {
            list l = new list();

            l.insertAtEnd(40);
            l.insertAtEnd(45);
            l.insertAtEnd(50);
            l.insertAtEnd(55);
            l.insertAtEnd(60);
            l.insertAtEnd(65);

            list.head = l.reverse(3);
            l.printLinkedList();
    }
}
