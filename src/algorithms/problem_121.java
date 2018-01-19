package algorithms;

/**
 * Created by chaozeyi on 18/1/8.
 */

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Example 1:
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 Input: [7, 6, 4, 3, 1]
 Output: 0

 In this case, no transaction is done, i.e. max profit = 0.
 */

/**
 * 这道题就是为了找出数组中最大的差值，并且要求减数一定要在被减数之后
 * 输出最大差值
 */
public class problem_121 {

    public int maxProfit(int[] prices) {

        //将该问题转换为最大子串问题
        if(prices.length == 0 || prices.length == 1)
            return 0;

        int[] subPrices = new int[prices.length - 1];
        for(int i = 0; i < subPrices.length; i++){
            subPrices[i] = prices[i+1]-prices[i];
        }
        int max = 0;
        int sum = 0;
        for(int j = 0; j < subPrices.length; j++){
            if(sum <= 0)
                sum = subPrices[j];
            else
                sum += subPrices[j];
            if(sum > max){
                max = sum;
            }
        }
        return max;


    }

}
