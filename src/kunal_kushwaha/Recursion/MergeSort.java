package kunal_kushwaha.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 52, 1, 56, 3, 7, 2, 88, 43, 234, 7, 2, 33, 2, 68, 32, 2 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

   static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] > second[j]) {
                mix[k] = second[j];
                j++;
            } else {
                mix[k] = first[i];
                i++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            k++;
            i++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
}
