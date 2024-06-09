package leetcode._268;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1 }; // 2 is the missing number
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int[] sortedArray = sort(nums);
        return missingIndex(sortedArray);
    }

    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) { // is there any problem if i put != instead of '<' ?
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
        return arr;
    }

    // swap function
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static int missingIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
// there is also more simplified solution