package leetcode._121;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] stockPrices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(stockPrices));

    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;

    }
}
