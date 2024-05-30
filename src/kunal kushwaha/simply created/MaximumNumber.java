public class MaximumNumber {
    public static void main(String[] args) {
        int[] myArray = { 1, 5, 3, 9, 3 };
        System.out.println(greatestNumber(myArray));
    }

    // pass an array as an argument and find the greatest number in it
    public static int greatestNumber(int[] nums) {
        if (nums.length <= 1) {
            System.out.println("Array size must be more than one integer");
            return 0;
        }
        int greatestNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > greatestNumber) {
                greatestNumber = nums[i];
            }
        }
        return greatestNumber;
    }
}
