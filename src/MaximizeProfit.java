/**
 * Created by ahurwitz on 6/26/17.
 */
public class MaximizeProfit {

    public void MaximizeProfit() {}

    public int maximize(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = prices[1] - minBuy;
        for (int i = 1; i < prices.length; i++){
            int currentPrice = prices[i];
            maxProfit = Math.max(currentPrice - minBuy, maxProfit);
            minBuy = Math.min(currentPrice, minBuy);
        }
        return maxProfit;
    }
}
