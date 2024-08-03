package dsa_everything.tree.heap;

import java.util.Arrays;

public class MaxHeap {
    // You will get an array heapify it (Max)

    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 32, 16, 7, 2, 7, 45, 745, 7, 9 };
        heapify(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    static void maxHeapify(int[] array, int i) {
        int largest = i;
        int leftChild = i * 2 + 1;
        int rightChild = i * 2 + 2;

        if (array.length > leftChild && array[largest] < array[leftChild]) {
            largest = leftChild;
        }

        if (array.length > rightChild && array[largest] < array[rightChild]) {
            largest = rightChild;
        }

        if (i != largest) {
            swap(largest, i, array);
            maxHeapify(array, largest);
        }
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
