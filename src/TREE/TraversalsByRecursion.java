// Tree traversal in Java
package TREE;


class BinaryTree {
    // Root of Binary Tree
    node root;

    BinaryTree() {
        root = null;
    }

    void postorder(node node) {
        if (node == null)
            return;

        // Traverse left
        postorder(node.left);
        // Traverse right
        postorder(node.right);
        // Traverse root
        System.out.print(node.item + "->");
    }

    void inorder(node node) {
        if (node == null)
            return;

        // Traverse left
        inorder(node.left);
        // Traverse root
        System.out.print(node.item + "->");
        // Traverse right
        inorder(node.right);
    }

    void preorder(node node) {
        if (node == null)
            return;

        // Traverse root
        System.out.print(node.item + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new node(1);
        tree.root.left = new node(12);
        tree.root.right = new node(9);
        tree.root.left.left = new node(5);
        tree.root.left.right = new node(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }
}
class node {
    int item;
    node left, right;

    public node(int key) {
        item = key;
        left = right = null;
    }
}