package TREE;
class Node1 {
    int data;
    Node1 left, right;
    public Node1(int item){
        data = item;
        left = right = null;
    }
}
public class IntroToTree {
    Node1 root;
    IntroToTree(int data){
        root = new Node1(data);
    }

    IntroToTree(){
        root = null;
    }

    public static void main(String[] args) {
        IntroToTree binaryTree = new IntroToTree();
        // creating root
        binaryTree.root = new Node1(1);

        // creating left and right child of tree
        binaryTree.root.left = new Node1(2);
        binaryTree.root.right = new Node1(3);

        // creating left child of left child of the root
        binaryTree.root.left.left = new Node1(4);
    }

}
