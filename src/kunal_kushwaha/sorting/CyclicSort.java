package kunal_kushwaha.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] unsorted = { 3, 6, 4, 2, 5, 1 };
        System.out.println(Arrays.toString(sort(unsorted)));
    }

    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        return arr;
    }

    // swap function
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
