package Recursion_array;

import java.util.ArrayList;

public class FindTargetNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 7, 8 };
        System.out.println(isTargetfounded(arr, 6, 0));

        int[] arr1 = { 1, 4, 6, 7, 8, 7, 4, 4 };
        System.out.println(findAllTargetIndexes(arr1, 4, 0,new ArrayList<>()));
    }

    static boolean isTargetfounded(int[] arr, int target, int index) {
        if (arr.length - 1 == index) {
            return false;
        }
        return (arr[index] == target) || isTargetfounded(arr, target, ++index);
    }

    static ArrayList<Integer> findAllTargetIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (arr.length == index) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllTargetIndexes(arr, target, ++index, list);
    }
}
