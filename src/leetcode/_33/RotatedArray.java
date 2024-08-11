package leetcode._33;

// 33. Search in Rotated Sorted Array
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// return an index of target

// how to find a pivot in a rotated array
// split the array in to two on mid basis ?
// eg:- [5,6,7,8,9,10,11,12,0,1,2,3,4], target = 0
// start is always greater than mid
// check whether mid is greater than start if yes then rotated array is such long 
// if no find the next mid and check same
// if we find the pivot element compare the target with start or with pivot + 1 to end
// and add pivot index to that

public class RotatedArray {
    public static void main(String[] args) {
        // int[] arr = { 13, 15, 18, 21, 25, 29, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr = { 1, 3 };
        int target = 3;
        // System.out.println(rotatedArrayTargetIndex(arr, target));
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            final int m = (l + r) / 2;
            if (nums[m] == target)
                return m;
            if (nums[l] <= nums[m]) { // nums[l..m] are sorted.
                if (nums[l] <= target && target < nums[m])
                    r = m - 1;
                else
                    l = m + 1;
            } else { // nums[m..n - 1] are sorted.
                if (nums[m] < target && target <= nums[r])
                    l = m + 1;
                else
                    r = m - 1;
            }
        }

        return -1;
    }

}