package TREE;


public class HeightOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(7);
        root.left.left = new Node(9);
        root.left.right = new Node(11);
        root.right = new Node(7);
        root.right.left = new Node(9);
        root.right.right = new Node(11);

        System.out.println("Height: "+ height(root));

        System.out.print("Nodes at K distance: ");
        printNodesAt_K_Distance(root,2);
    }
    static int height(Node root){
        if(root == null)
            return 0;
        return (Math.max(height(root.left), height(root.right)) + 1);
    }

    static void printNodesAt_K_Distance(Node root, int k){
        if(root == null)
            return;
        if(k == 0){
            System.out.print(root.data+" ");
        }
        else{
            printNodesAt_K_Distance(root.left,k-1);
            printNodesAt_K_Distance(root.right,k-1);
        }
    }
}
