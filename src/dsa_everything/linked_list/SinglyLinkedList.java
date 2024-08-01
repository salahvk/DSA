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
        list.addNode(11);

        //  display nodes
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

    public void displayNodes() {
        Node temp = head;
        while (temp != null) {
           System.out.println(temp.data);   
           temp = temp.next; 
        }
    }
}
