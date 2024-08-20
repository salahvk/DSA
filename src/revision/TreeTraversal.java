package revision;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    void inorderTraversal(Node node) {
        // here we pass root node to the tree
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.println(node.data);
        inorderTraversal(node.right);
    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.data);
    }

    void levelOrderTraversal(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.println(currentNode.data);
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null) queue.add(currentNode.right);
        }
    }
}
