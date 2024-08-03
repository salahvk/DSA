package dsa_everything.linked_list.doubly_linked_list;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(8);
        list.insertAtEnd(12);
        list.insertAtEnd(19);
        list.insertAtEnd(30);
        list.insertAtEnd(10);
        list.insertAtEnd(11);

        // // display nodes from beginning
        list.traverseFromBeginning();

        // // display nodes from end
        // list.traverseFromEnd();

        // inserting a value just after 30
        list.insertAfter(35, 11);

        // display nodes from beginning
        list.traverseFromBeginning();

        list.insertAtBeginning(1000);
        list.deleteNode(35);

        // display nodes from beginning
        list.traverseFromBeginning();
    }

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
        }
    }

    Node headNode;
    Node tailNode;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            newNode.previous = tailNode;
            tailNode.next = newNode;
        }
        tailNode = newNode;

    }

    public void insertAfter(int data, int nextTo) {
        Node newNode = new Node(data);
        Node tempNode = headNode;
        while (tempNode != null && tempNode.data != nextTo) {
            tempNode = tempNode.next;
        }

        if (tempNode == null) {
            System.out.println("No next to value found");
            return;
        }
        if (tempNode == tailNode) {
            newNode.previous = tempNode;
            tempNode.next = newNode;
            tailNode = newNode;
            return;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
        newNode.previous = tempNode;
        newNode.next.previous = newNode;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            return;
        }
        headNode.previous = newNode;
        newNode.next = headNode;
        headNode = newNode;
    }

    public void deleteNode(int data) {
        Node currentNode = headNode;
        while (currentNode != null && currentNode.data != data) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Nothing to delete");
            return;
        }
        if (currentNode == headNode) {
            headNode = headNode.next;
            headNode.previous = null;
            return;
        }
        if (currentNode == tailNode) {
            tailNode.previous.next = null;
            tailNode = tailNode.previous;
            return;
        }
        currentNode.previous.next = currentNode.next;
        currentNode.next.previous = currentNode.previous;
    }

    public void traverseFromBeginning() {
        if (headNode == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void traverseFromEnd() {
        if (tailNode == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = tailNode;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.previous;
        }
        System.out.println();
    }

    public void update() {

    }
}
