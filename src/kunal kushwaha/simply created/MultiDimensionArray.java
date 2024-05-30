import java.util.Arrays;
import java.util.Scanner;

// Sample programme to print 2D arrays that user entered
public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] m_array = new int[5][3];

        // User entering Data into array
        for (var row = 0; row < m_array.length; row++) {
            System.out.println("Enter the values to the " + row + "th row of the array");
            for (var col = 0; col < m_array[row].length; col++) {
                m_array[row][col] = scanner.nextInt();
            }
        }
        System.out.println("User entry completed");
        System.out.println("Entered Numbers are");
        // Printing all the values
        for (

        int[] a : m_array) {
            System.out.println(Arrays.toString(a));
        }
    }

}
