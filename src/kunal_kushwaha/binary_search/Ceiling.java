package kunal_kushwaha.binary_search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 8, 9, 11, 15, 18, 19, 24, 27, 30, 38, 45, 47, 49, 56, 798, 799 };
        // int[] arr1 = { 1, 2, 3 };
        int target = 37;
        findCeiling(arr, target);
    }

    static void findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                System.out.println("Element Found at position " + mid);
                break;
            }
            // System.out.println("Start:" + start + " End:" + end + " Mid" + mid);
        }
        if (arr[mid] != target) {
            System.out.println("Ceiling of the number is  " + arr[start]);
        }

    }
}
