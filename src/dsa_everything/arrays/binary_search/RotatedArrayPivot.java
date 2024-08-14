package dsa_everything.arrays.binary_search;

public class RotatedArrayPivot {

    int findPivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        int m = 0;
        while (s < e) {
            m = s + (e - s) / 2;

            if (arr[m] > arr[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return s;
    }

    // things i do wrong
    // 1 - putting arr[s] instead of arr[e]
    // every integer is less than arr[s] but every integer in rotated array is
    // bigger that arr[e] and smaller than arr[s]
    // 2 -putting equal sign in s<e
    // 3 -returning mid

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
