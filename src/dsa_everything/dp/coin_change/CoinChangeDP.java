package dsa_everything.dp.coin_change;

import java.util.Arrays;

public class CoinChangeDP {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int sum = 11;
        System.out.println(coinChange(coins, sum));
    }

    public static int coinChange(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1; // There is one way to make zero sum

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
                System.out.println(Arrays.toString(dp));
            }
        }

        return dp[sum];
    }
}
