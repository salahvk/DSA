package brototype;

public class DLinkedList {
    class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }
    }

    public Node headNode = null;
    public Node tailNode = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            tailNode.next = newNode;
            newNode.previous = tailNode;
        }
        tailNode = newNode;
    }

    public void displayNode() {
        Node tempNode = headNode;
        if (tempNode == null) {
            return;
        }
        System.out.println("Node in straight order");
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }

    }

    public void displayNodeInReverse() {
        Node tempNode = tailNode;
        if (tempNode == null) {
            return;
        }
        System.out.println("Node in reverse order");
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.previous;
        }

    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.addNode(1);
        list.addNode(5);
        list.addNode(8);
        list.addNode(12);
        list.addNode(15);

        list.displayNode();
        list.displayNodeInReverse();
    }
}
