package TREE;

import java.util.*;
public class CreateBinaryTree {
    static class Node{
        int data;
        Node left = null;
        Node right = null;

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

        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal:");
        postorder(root);
        System.out.println();
        System.out.println("Preorder Traversal:");
        preorder(root);

    }
    private static void inorder(Node root){
        if(root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    private static void preorder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    private static void postorder(Node root) {
        if(root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}
