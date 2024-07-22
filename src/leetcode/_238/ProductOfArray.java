package leetcode._238;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println((productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] productList = new int[nums.length];
        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            productList[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            productList[i] *= right ;
            right *= nums[i];
        }
        return productList;
    }
}
