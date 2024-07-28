package dsa_everything.sorting;

public class CountingSort {
    // Find the largest element in an array
    // Create an auxilary array with size of that largest element
    // iterate through the auxilary array and add the frequency of each elements of array to the respective index
    // loop the auxilary array and assign  the frequency such that to get the array sorted
    public static void countingSort(int[] A) {
        int N = A.length;

        // First, find the maximum value in A[]
        int K = 0;
        for (int i = 0; i < N; i++) {
            K = Math.max(K, A[i]);
        }
        System.out.println("Maximum value in A: " + K);

        // Initialize the elements of Aux[] with 0
        int[] Aux = new int[K + 1];
        System.out.println("Aux array after initialization: " + java.util.Arrays.toString(Aux));

        // Store the frequencies of each distinct element of A[],
        // by mapping its value as the index of Aux[] array
        for (int i = 0; i < N; i++) {
            Aux[A[i]]++;
        }
        System.out.println("Aux array after counting frequencies: " + java.util.Arrays.toString(Aux));

        // Build the sorted array
        int j = 0;
        for (int i = 0; i <= K; i++) {
            while (Aux[i] > 0) {
                A[j] = i;
                j++;
                Aux[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + java.util.Arrays.toString(A));

        countingSort(A);

        System.out.println("Sorted array: " + java.util.Arrays.toString(A));
    }
}
