package revision.sliding_window;

public class BuySellCrypto {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int l = 0;
        int r = 1;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                ans = Math.max(prices[r] - prices[l], ans);
            } else {
                l = r;
            }
            r++;
        }
        return ans;
    }
}
