package dsa_everything.tree.traversal_of_tree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class InOrder {

    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorderTraversal(root);
    }
}
