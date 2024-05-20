import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountingOccurence {
    // Two problems where finding the most occured number and finding the occurence
    // of user selected number
    // in the case of most occurred number there are so many methods 1) By running
    // two loops 2) By using hash map
    // 3) sort the array and compare the nearest numbers (less complexity)
    public static void main(String[] args) {
        countingMostOccuredNumberByHash();
    }

    static void countingMostOccuredNumberByHash() {
        System.out.println("Following is a program that returns the number of occurrences in a given list of numbers.");
        System.out.println("Input size of the list");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + "numbers");
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        // inputing and storing as hash
        for (var i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (hp.containsKey(array[i])) {
                int freq = hp.get(array[i]);
                freq++;
                hp.put(array[i], freq);
            } else {
                hp.put(array[i], 1);
            }
        }
        int max_count = 0;
        int most_occured_num = -1;
        // Looping each entry in the map
        for (Entry<Integer, Integer> val : hp.entrySet()) {
            // System.out.println(hp);
            // System.out.println("Entry set" + hp.entrySet()); // its like an array of values not
            // System.out.println("Value :" + val);

            if (max_count < val.getValue()) {
                max_count = val.getValue();
                most_occured_num = val.getKey();
            }
        };
        // System.out.println(hp);
        // System.out.println(Arrays.toString(array));
        System.out.println(most_occured_num + " is the most occured number " + max_count + " times");
    }

}
