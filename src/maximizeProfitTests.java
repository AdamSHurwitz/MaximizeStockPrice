/**
 * Created by ahurwitz on 6/26/17.
 */
public class maximizeProfitTests {

    public maximizeProfitTests() {
        runTests();
    }

    private void runTests() {
        test(new int[]{10, 7, 5, 8, 11, 9});
        test(new int[]{10, 9, 8, 7, 6, 5});
        test(new int[]{1, 9, 8, 17, 6, 5});
    }

    private void test(int[] prices) {
        MaximizeProfit maximizeProfit = new MaximizeProfit();
        System.out.println("Max Profit: " + maximizeProfit.maximize(prices));
    }
}
