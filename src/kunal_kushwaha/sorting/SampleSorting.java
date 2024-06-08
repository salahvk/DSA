package kunal_kushwaha.sorting;
import java.util.Arrays;

public class SampleSorting {
    public static void main(String[] args) {
        int[] unsorted = {7,3,9,15,67,1};
        System.out.println(Arrays.toString(bubbleSortAscending(unsorted)));
    }
    public static int[] bubbleSortAscending(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
