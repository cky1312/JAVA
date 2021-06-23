package TREE;

import java.util.*;
public class CreateTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        node2 root = createTree();

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();

        System.out.print("InOrder: ");
        inOrder(root);


    }
    static node2 createTree(){
        node2 root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if(data == -1)
            return null;

        root = new node2(data);

        System.out.println("Enter left for "+ data);
        root.left = createTree();

        System.out.println("Enter right for "+data);
        root.right = createTree();



        return root;
    }

    static void preOrder(node2 root){
        if(root == null)
            return;

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(node2 root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(node2 root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class node2{
    node2 left, right;
    int data;
    node2(int d){
        data = d;
    }
}