package kunal_kushwaha.binary_search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] desArr = { 99, 95, 79, 45, 41, 40, 34, 24, 21, 16, 13, 10 };
        int[] ascArr = { 1, 5, 8, 11, 16, 18, 19, 24, 27 };
        int target = 19;
        System.out.println("Element found at position " + findTargetPosition(ascArr, target));
    }

    public static int findTargetPosition(int[] arr, int target) {
        boolean isDesc = arr[0] > arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isDesc) {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
