package brototype;

import java.util.Arrays;

public class positioning_target_in_array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 3, 5, 3, 2, 8, 3, 68, 4, 3 };
        System.out.println(Arrays.toString(positionTarget(arr, 3)));
    }

    static int[] positionTarget(int[] arr, int target) {
        int position = arr.length - 1;
        for (var i = 0; i < arr.length; i++) {
            if (position == i || i > position) {
                break;
            } else if (arr[position] == target) {
                position--;
            } else if (arr[i] == target) {
                arr[i] = arr[position];
                arr[position] = target;
                position--;
            }
        }
        return arr;
    }
}
