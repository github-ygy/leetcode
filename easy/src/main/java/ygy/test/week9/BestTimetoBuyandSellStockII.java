package ygy.test.week9;

/**
 * Created by guoyao on 2017/10/27.
 */
public class BestTimetoBuyandSellStockII {

    public static void main(String[] args) {
        int[] prices={7, 1, 3, 4, 6, 2, 5};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return  0 ;
        }

        int maxProfit = 0 ;
        int sellPrice=prices[0];
        for(int i = 1 ;i < prices.length ;i ++) {
            if(prices[i] > sellPrice) {
                maxProfit+=prices[i] - sellPrice;
            }
            sellPrice=prices[i];
        }
        return maxProfit;
    }
}
