package dsa_everything.dp.coin_change;

import java.util.ArrayList;
import java.util.List;

public class my_solutions {
    // coins = [1,2,5], amount = 11
    // Output: 3
    // public int coinChange(int[] coins, int amount) {
        
    // }
     public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int sum = 11;
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(coins, sum, new ArrayList<>(), result);
        // System.out.println(result);
    }

    private static void findCombinations(int[] coins, int sum, List<Integer> current, List<List<Integer>> result) {
        if (sum == 0) {
            result.add(new ArrayList<>(current));
            System.out.println(result);
            return;
        }

        if (sum < 0) {
            return;
        }

        for (int coin : coins) {
            current.add(coin);
            System.out.println(current);
            findCombinations(coins, sum - coin, current, result);
            current.remove(current.size() - 1);
            System.out.println(current);
        }
    }
}
