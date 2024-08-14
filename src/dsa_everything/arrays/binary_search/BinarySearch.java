package dsa_everything.arrays.binary_search;

public class BinarySearch {

    int targetIndex(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int m = 0;

        while (s <= e) {
            m = s + (e - s) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;

    }

    // things i did wrong at first was putting end as arr.length only and did not
    // thinking about the condition where s may be equal to e While(s<=e)
    // I can also modify binary search adding one else if and one else condition

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();

        // Example arrays
        int[] arr4 = { 0, 1, 2, 3, 4, 7, 8, 9, 15 };

        // Finding pivot index in different arrays
        System.out.println("Pivot index in arr: " + solution.targetIndex(arr4, 15)); // Output: 0

    }
}
