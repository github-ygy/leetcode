package ygy.test.week8;

/**
 * Created by guoyao on 2017/10/22.
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {

    }

    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.

     If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     Input: [7, 1, 5, 3, 6, 4]
     Output: 5

     max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

     Input: [7, 6, 4, 3, 1]
     Output: 0

     In this case, no transaction is done, i.e. max profit = 0.
     */


    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 ) return  0 ;

        int maxProfit = 0 ;
        int sellPrice=prices[0];
        for(int i = 1 ; i < prices.length ; i++) {
            if (prices[i] > sellPrice) maxProfit=Math.max(maxProfit, prices[i] - sellPrice);
            else sellPrice=prices[i];
        }

        return maxProfit;
    }
}
