package dsa_everything.tree.traversal_of_tree;

public class PreOrder {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
