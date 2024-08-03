package dsa_everything.tree.heap;

import java.util.Arrays;

public class MaxHeapPush {
    // This function is to create a heap after each insertion
    int[] heap;
    int size;
    int capacity;

    MaxHeapPush(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    void push(int data) {
        if (size == capacity) {
            System.out.println("Heap is full, Increase the Capacity");
            return;
        }

        heap[size] = data;
        size++;
        heapifyUp(size - 1);
    }

    void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex, heap);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Swap

    void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        MaxHeapPush maxHeap = new MaxHeapPush(20);
        int[] elements = { 5, 2, 6, 32, 16, 7, 2, 7, 45, 745, 7, 9 };
        for (int element : elements) {
            maxHeap.push(element);
        }
        System.out.println(Arrays.toString(maxHeap.heap));
    }

}
