package leetcode._448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * DisappearedNumbers
 */
public class DisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = { 4, 2, 3, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));
        // Output: [5,6]
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return missingNumbers(nums);
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

    public static List<Integer> missingNumbers(int[] arr){
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int correctValue = i+ 1; // error occured when i do int correctIndex = nums[i] - 1;
            if (arr[i] != correctValue) {
                missingNumbers.add(i+1);
            }
        }
        return missingNumbers;
    }
}