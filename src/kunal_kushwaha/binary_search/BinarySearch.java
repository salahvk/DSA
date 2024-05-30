package kunal_kushwaha.binary_search;

// below is a problem which there is an array and target here 
// returns the position of target

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 8, 9, 11, 15, 18, 19, 24, 27, 30, 38, 45, 47, 49, 56, 798, 799 };
        int target = 799;
        findTargetPostion(arr, target);
    }

    static void findTargetPostion(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                System.out.println("Element Found at position " + mid);
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}
