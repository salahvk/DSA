package dsa_everything.linked_list;

public class SinglyLinkedList {
    public static void main(String[] args) {
        // add 3,5,7,9,11 to the linked list
        // display it back
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.addNode(9);
        list.addNode(10);
        list.addNode(11);

        // display nodes
        list.displayNodes();

        // add a node after value 9
        list.addAfter(10, 9);

        // display nodes
        list.displayNodes();

    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void addAfter(int data, int nextTo) {
        Node temp = head;
        Node newNode = new Node(data);
        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("No nextTo value found");
            return;
        }
        if (temp == tail) {
            tail.next = newNode;
            tail = newNode;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    

    public void displayNodes() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
