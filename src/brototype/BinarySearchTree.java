package brototype;

public class BinarySearchTree {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            data = this.data;
        }
    }

    public Node root;

    void insert(int data) {
        Node currentNode = root;
        if (currentNode == null) {
            root = new Node(data);
            System.out.println("Root added");
            return;
        }
        while (true) {
            if (data < currentNode.data) {
                currentNode.left = new Node(data);
                break;
            } else if (data > currentNode.data) {
                currentNode.right = new Node(data);
                break;
            }
        }
    }

    public boolean contains(int data) {
        Node currentNode = root;
        while (currentNode != null) {
            if (data < currentNode.data) {
                // put the node in left
                currentNode = currentNode.left;
            } else if (data > currentNode.data) {
                // put the node in right
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(0);
        binarySearchTree.insert(5);
        binarySearchTree.insert(10);

        System.out.println(binarySearchTree.contains(0));
    }
}
