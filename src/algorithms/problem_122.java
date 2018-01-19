package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Best Time to Buy and Sell Stock II
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit.
 You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 */
public class problem_122 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int[] subPrices = new int[prices.length - 1];
        for(int i = 0; i < subPrices.length; i++){
            subPrices[i] = prices[i+1]-prices[i];
        }
        int res = 0;
        //一旦小于0就开始卖掉
        for(int j = 0; j < subPrices.length; j++){
            if(subPrices[j] > 0)
                res += subPrices[j];

        }
        return res;
    }
}
