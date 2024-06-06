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
        int[] arr = {  1,3};
        int target = 3;
        // System.out.println(rotatedArrayTargetIndex(arr, target));
        System.out.println(search(arr, target));
    }

    public static int rotatedArrayTargetIndex(int[] arr, int target) {
        int pivotIndex = pivotElementIndex(arr);
        System.out.println(pivotIndex);
        int start = 0;
        int end = arr.length - 1;
        if (pivotIndex == 0) {
            return findTargetPosition(arr,target, start, end);
        } else if (arr[start] > target) {
            // do binary search
            return findTargetPosition(arr, target, pivotIndex + 1, end);
        } else {
            return findTargetPosition(arr, target, start, pivotIndex);
        }
    }

    public static int pivotElementIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[start]) {
                // rotated array is such long that it extends its pivot to after mid also
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return start;

    }

    // static int findTargetPostion(int[] arr, int target, int start, int end) {
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         if (target > arr[mid]) {
    //             start = mid + 1;
    //         } else if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else {
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }

    public static int findTargetPosition(int[] arr, int target,int start,int end) {
        boolean isDesc = arr[start] > arr[end];

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
