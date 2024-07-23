package salah.sorting;

public class RadixSort {
    // Function to perform counting sort on arr[] according to the digit represented by place
    public static void countSort(int[] arr, int n, int place) {
        int range = 10; // Range for integers is 10 as digits range from 0-9
        int[] output = new int[n];
        int[] freq = new int[range];

        // Initialize count array with all zeros
        for (int i = 0; i < range; i++) {
            freq[i] = 0;
        }

        // Store the count of occurrences in freq[]
        for (int i = 0; i < n; i++) {
            freq[(arr[i] / place) % range]++;
        }

        // Change freq[i] so that it contains the actual position of this digit in output[]
        for (int i = 1; i < range; i++) {
            freq[i] += freq[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[freq[(arr[i] / place) % range] - 1] = arr[i];
            freq[(arr[i] / place) % range]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    public static void radixSort(int[] arr, int n) {
        // Find the maximum number to know the number of digits
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Do counting sort for every digit. Note that instead of passing the digit number,
        // place is passed. place is 10^i where i is the current digit number
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, n, place);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr, n);

        radixSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}

