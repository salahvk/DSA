package kunal_kushwaha.simply_created;

import java.util.ArrayList;

// find the target digit in a given number and return its position
public class TargetNumber {
    public static void main(String[] args) {
        int num = 79426346;
        int target = 6;
        System.out.println(arrayToString(positionOfTarget(num, target)));
    }

    public static ArrayList<Integer> positionOfTarget(int num, int target) {
        ArrayList<Integer> position = new ArrayList<>();
        ArrayList<Integer> tempPosition = new ArrayList<>();
        int temp = num;
        int noOfDigits = 0;
        while (temp > 0) {
            int remainder = temp % 10;
            temp /= 10;
            if (remainder == target) {
                tempPosition.add(noOfDigits);
            }
            noOfDigits++;
        }
        for (int i = 0; i < tempPosition.size(); i++) {
            position.add((noOfDigits - tempPosition.get(i)));
        }
        return position;
    }

    public static String arrayToString(ArrayList<Integer> array) {
        if (array == null || array.size() == 0) {
            return "There is no valid position in the digit";
        }

        if (array.size() == 1) {
            return "The position of digit is in " + array.get(0);
        }

        StringBuilder sb = new StringBuilder("The position of digits are ");
        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
            if (i < array.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(" ");

        return sb.toString();
    }
}
