package brototype;

public class StackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        };
    }

    public Node top;

    public void push(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public void display() {
        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(0);
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.pop();
        stackLinkedList.display();
    }
}
