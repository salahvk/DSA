package brototype;

public class SLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void displayNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void delete(int data) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Nothing to delete");
            return;
        }

        if (temp == tail) {
            tail = prev;
            tail.next = null;
            return;
        }

        prev.next = temp.next;

    }

    public void insertAfter(int nextTo, int data) {
        // create a node class with data
        // loop the list and find there is a value equals to nextTo
        // if no return if yes change the assigned values of the nodes
        // consider all other cases also (like next to becoming tail)

        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        if(temp == tail){
            tail.next = newNode;
            tail = newNode;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        SLinkedList list = new SLinkedList();
        list.displayNode();

        list.addNode(0);
        list.addNode(8);
        list.addNode(2);
        list.addNode(100);
        list.delete(100);
        list.insertAfter(9, 5);

        list.displayNode();
    }

}
