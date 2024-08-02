package dsa_everything.linked_list.doubly_linked_list;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(8);
        list.insertAtEnd(11);
        list.insertAtEnd(19);
        list.insertAtEnd(30);
        list.insertAtEnd(10);
        list.insertAtEnd(11);

        // display nodes
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

    public void insertAfter() {

    }

    public void insertAtBeginning() {

    }

    public void deleteNode() {

    }

    public void traverseFromBeginning() {
        if (headNode == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void traverseFromEnd() {

    }

    public void update() {

    }
}
