package dsa_everything.linked_list.singly_linked_list;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.displayNodes();
        list.reverse();
        list.displayNodes();
    }

    Node head;
    Node tail;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            // 1 2 3 4
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
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
