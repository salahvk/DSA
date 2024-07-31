package dsa_everything.dp.heap;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int[] array) {
        this.heap = array;
        this.size = array.length;
        buildMaxHeap();
    }

    private void buildMaxHeap() {
        // Start from the last non-leaf node and heapify each node
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        // System.out.println(i);
        // System.out.println(heap[i]);
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = heap[i];
            heap[i] = heap[largest];
            heap[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(largest);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 3, 8, 5, 7, 2, 99, 5, 9, 6, 8, 20, 10, 12, 18, 9 };
        MaxHeap maxHeap = new MaxHeap(array);
        System.out.println("Max Heap:");
        maxHeap.printHeap();
        
    }
}
