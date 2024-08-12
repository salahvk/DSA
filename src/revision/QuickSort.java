package revision;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }

    static int[] quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(arr, s, high);
        quickSort(arr, low, e);
        return arr;
    }
}
