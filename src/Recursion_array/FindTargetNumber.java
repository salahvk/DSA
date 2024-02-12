package Recursion_array;
public class FindTargetNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8};
        System.out.println(isTargetfounded(arr,6, 0));
    }

 static   boolean isTargetfounded(int[] arr, int target, int index) {
        if (arr.length - 1 == index) {
            return false;
        }
        return (arr[index] == target) || isTargetfounded(arr, target, ++index);
    }
}
