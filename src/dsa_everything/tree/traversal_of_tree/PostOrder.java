package dsa_everything.tree.traversal_of_tree;

public class PostOrder {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }
}
