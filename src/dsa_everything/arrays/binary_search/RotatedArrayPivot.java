package dsa_everything.arrays.binary_search;

public class RotatedArrayPivot {

    int findPivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;

            if (arr[m] < arr[s]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    // int findPivotIndex(int[] array) {
    // int left = 0;
    // int right = array.length - 1;

    // while (left < right) {
    // int mid = left + (right - left) / 2;

    // if (array[mid] > array[right]) {
    // left = mid + 1;
    // } else {
    // right = mid;
    // }
    // }

    // return left;
    // }

    public static void main(String[] args) {
        RotatedArrayPivot solution = new RotatedArrayPivot();

        // Example arrays
        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr2 = { 6, 7, 8, 1, 2, 3, 4, 5 };
        int[] arr3 = { 6, 7, 8, 1, 2 };
        int[] arr4 = { 1, 2, 3, 4, 5 };

        // Finding pivot index in different arrays
        System.out.println("Pivot index in arr1: " + solution.findPivotIndex(arr1)); // Output: 4
        System.out.println("Pivot index in arr2: " + solution.findPivotIndex(arr2)); // Output: 3
        System.out.println("Pivot index in arr3: " + solution.findPivotIndex(arr3)); // Output: 3
        System.out.println("Pivot index in arr4: " + solution.findPivotIndex(arr4)); // Output: 0

    }
}
