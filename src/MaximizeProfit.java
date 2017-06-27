/**
 * Created by ahurwitz on 6/26/17.
 */
public class MaximizeProfit {

    public void MaximizeProfit() {}

    public int maximize(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = prices[1] - minBuy;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] - minBuy > maxProfit) {
                maxProfit = prices[i] - minBuy;
            }
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        return maxProfit;
    }
}
