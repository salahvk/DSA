package brototype;

public class QueueLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node front;
    public Node rear;

    void enqueue(int data) {
        // if rear is empty put the node in front same as in rear
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        // Puting the newnode next to the last node
        rear.next = newNode;
        // so if we do System.out.println(front.next.data); we will get the new node
        // data because the node is assigning to the numbers
        rear = newNode;
    }

    void dequeue() {
        if (front != null) {
            front = front.next;
        }
    }

    void display() {
        System.out.println("Displaying the queue");
        Node currentNode = front;

        while (currentNode != null) {
            System.err.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(0);
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.dequeue();
        queueLinkedList.display();

    }
}
