package leetcode._852;

public class PeakIndex {
    public static void main(String[] args) {
        int[] mountainArray = { 0, 3, 5, 8, 9, 6, 4, 2, 1 };
        // ans will be 4
        System.out.println(peakIndexInMountainArray(mountainArray));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in the descending part of the array
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
}
