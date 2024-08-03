package dsa_everything.tree.heap;

import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        // You will get an array heapify it (Min)
        int[] arr = { 5, 2, 6, 32, 16, 7, 2, 7, 45, 745, 7, 9 };
        heapify(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            minHeapify(arr, i);
        }
    }

    static void minHeapify(int[] arr, int i) {
        int largest = i;
    }

    static void swap(int i,int j,int[] arr){

    }
}
