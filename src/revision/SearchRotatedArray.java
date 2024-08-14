package revision;

public class SearchRotatedArray {
    public int search(int[] nums, int target) {
        int pivotIndex = getPivotIndex(nums);

        if (pivotIndex > 0 && target >= nums[0]) {
            return binarySearch(0, pivotIndex - 1, nums, target);
        } else {
            return binarySearch(pivotIndex, nums.length - 1, nums, target);
        }

        // what i went wrong at first is checking the condition of target <
        // nums[pivotIndex]
    }

    int getPivotIndex(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] < nums[e]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return e;
    }

    int binarySearch(int s, int e, int[] arr, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 8, 0, 1, 2 };
        SearchRotatedArray searchRotatedArray = new SearchRotatedArray();
        System.out.println(searchRotatedArray.search(nums, 3)); // Output: -1
        System.out.println(searchRotatedArray.search(nums, 6)); // Output: 2
    }
}
