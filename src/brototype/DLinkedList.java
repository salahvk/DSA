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

    void removeDuplicate() {
        // loop all over the list to find a value that equals the next values to it
        // if we got a value cut the links before and after
        System.out.println("Removing duplicate function executed");
        Node temp = headNode;

        while (temp != null) {
            temp = temp.next;
            // if (temp == null) {
            //     return;
            // }
            // Node previous = temp.previous;
            // while (temp.data == previous.data) {
            //     previous.next = temp.next;
            // }
        }
        // System.out.println(temp.data);
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.addNode(1);
        list.addNode(5);
        list.addNode(5);
        list.addNode(5);
        list.addNode(8);
        list.addNode(8);
        list.addNode(12);
        list.addNode(15);
        // list.delete(8);
        list.insertAfter(12, 9);
        list.removeDuplicate();
        list.displayNode();
        // list.displayNodeInReverse();
    }
}
