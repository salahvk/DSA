package leetcode._287;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] unsorted = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(unsorted));
        // [1, 2, 3, 4, 2] Correct array after sort
        // 
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            System.out.println(i + " loop start");
            if (nums[i] != i + 1) {               
                int correctIndex = nums[i] - 1;
                System.out.println(nums[i] + " nums[i] ,"  + i + " i + 1 ");
                System.out.println(nums[i] + " nums[i] ," + " correctIndex " + nums[correctIndex]);
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                    System.out.println(Arrays.toString(nums) + " Correct array after sort");
                } else {
                    System.out.println("inside 2 " + i);
                    return nums[i];
                }
            } else {
                i++;
            }

        }
        return -1;
    }

    // swap function
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
