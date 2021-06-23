package TREE;

import java.util.Stack;

public class InorderTraversal {
    Node root;
    void inorder(){
        if(root == null){
            return;
        }
        Stack<Node>s = new Stack<>();
        Node current = root;

        while(current != null || s.size()>0) {
            while(current != null){
                s.push(current);
                current = current.left;
            }
            current = s.pop();
            System.out.print(current.data + " ");

            current = current.right;
        }
    }

    public static void main(String[] args) {
        InorderTraversal tree =new InorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
}
class Node{
    int data;
    Node left,right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}