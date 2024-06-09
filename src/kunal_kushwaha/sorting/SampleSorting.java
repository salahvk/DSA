package kunal_kushwaha.sorting;

import java.util.Arrays;

public class SampleSorting {
    public static void main(String[] args) {
        int[] unsorted = { 7, 3, 9, 15, 67, 1 };
        // System.out.println(Arrays.toString(bubbleSortAscending(unsorted)));
        // System.out.println(Arrays.toString(selectionSortAscending(unsorted)));
        System.out.println(Arrays.toString(insertionSort(unsorted)));
    }

    // bubble sort
    public static int[] bubbleSortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // selection sort
    public static int[] selectionSortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - 1 - i;
            int max = getMaxIndex(arr, end);
            swap(arr, max, end);
        }
        return arr;

    }

    public static int getMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // insertion sort
    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }else{
                    break;
                }
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
