package TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
    public Binary_Tree(int[] pre, int[] in) {
        this.root = construct(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    private class Node{
        int data;
        Node left,right;
    }

    private Node root;
    // size represents the total nodes in the tree
    private int size;

    public Binary_Tree(){
        this.root = takeInput(new Scanner(System.in),null,true);
    }
    // parent denotes the value of parent node.
    // ilc denotes --> is left child present
    public Node takeInput(Scanner sc,Node parent,boolean ilc){
        if(parent == null){
            System.out.println("Root node data?");
        }
        else{
            if(ilc){
                System.out.println("Enter the value of left child of "+ parent.data);
            }
            else {
                System.out.println("Enter the value of right child of "+ parent.data);
            }
        }

        int val = sc.nextInt();

        Node n = new Node();
        n.data = val;
        this.size++;

        System.out.println(n.data+" has left child ?");
        boolean hlc = sc.nextBoolean();

        if(hlc){
            n.left = takeInput(sc,n,true);
        }
        System.out.println(n.data+" has right child ?");
        boolean hrc = sc.nextBoolean();

        if(hrc){
            n.right = takeInput(sc,n,false);
        }

        return n;
    }

    public void display(){
        System.out.println("*-*-*-*-*-*-*-*-*");
        display(this.root);
        System.out.println("*-*-*-*-*-*-*-*-*");
    }

    private void display(Node node){
        if(node == null)
            return;

        String str = "";

        if(node.left == null)
            str += "null";
        else
            str += node.left.data;

        str += " <--" + node.data + " -->";
        if(node.right == null)
            str += "null";
        else
            str += node.right.data;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // constructing tree using inorder and preorder traversals
    private Node construct(int[] pre, int[] in, int plo, int phi, int ilo, int ihi){
        if(plo > phi || ilo > ihi){
            return null;
        }

        Node nn = new Node();
        nn.data = pre[plo];

        int si = -1;
        for(int i = ilo; i <= ihi; i++){
            if(pre[plo] == in[i]){
                si = i;
                break;
            }
        }

        int nel = si - ilo;

        nn.left = construct(pre, in, plo + 1, plo + nel, ilo, si - 1);
        nn.right = construct(pre, in, plo + nel + 1, phi, si + 1, ihi);

        return nn;
    }

    static void printLevelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data+" ");
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }
    }
    void Display(){
        printLevelOrder(this.root);
    }
}
