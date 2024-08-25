package leetcode.easy.array;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
public class BestTimeToBuyAndSellStock121 {

  public int maxProfit(int[] prices) {
    if (prices.length == 1) {
      return 0;
    }
    int max = prices[prices.length - 1];
    int res = 0;
    for (int i = prices.length - 2; i >= 0; i--) {
      if (prices[i] < max) {
        res = Math.max(res, max - prices[i]);
      }
      max = Math.max(max, prices[i]);
    }
    return res;
  }
}
