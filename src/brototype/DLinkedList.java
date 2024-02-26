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

    public void delete(int data) {
        Node tempNode = headNode, prevNode = null;
        if (tempNode == null) {
            return;
        }

        while (tempNode != null && tempNode.data != data) {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        if (tempNode == null) {
            return;
        }

        prevNode.next = tempNode.next;
    }

    public void insertAfter(int nextTo, int data) {
        Node newNode = new Node(data);
        Node temp = headNode;

        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Nothing to insert after");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.previous = temp;

    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.addNode(1);
        list.addNode(5);
        list.addNode(8);
        list.addNode(12);
        list.addNode(15);
        // list.delete(8);
        // list.insertAfter(15, 100);
        // list.insertAfter(100, 100);
        list.insertAfter(100, 5);
        list.displayNode();
        // list.displayNodeInReverse();
    }
}
