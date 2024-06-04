package kunal_kushwaha.binary_search;

// problem to find index of a number in infinite array
public class InfiniteArray {
    public static void main(String[] args) {
        int[] infiniteArray = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 130;
        System.out.println(targetIndex(infiniteArray, target));
    }

    public static int targetIndex(int[] infiniteArray, int target) {
        int start = 0;
        int end = 1;
        while (target > infiniteArray[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(infiniteArray, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                System.out.println("Element Found at position " + mid);
                return mid;
            }
        }
        return -1;
    }

    // Kunal problem has an boundexception error


        
        
}
