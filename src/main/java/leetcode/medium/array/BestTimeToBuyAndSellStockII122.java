package leetcode.medium.array;

//You are given an integer array prices where prices[i] is the price
// of a given stock on the ith day.
//
//On each day, you may decide to buy and/or sell the stock.
// You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day.
//
//Find and return the maximum profit you can achieve.
public class BestTimeToBuyAndSellStockII122 {

  public int maxProfit(int[] prices) {
    if (prices.length == 1) {
      return 0;
    }
    int prevMax = prices[prices.length - 1];
    int res = 0;
    for (int i = prices.length - 2; i >= 0; i--) {
      if (prices[i] < prevMax) {
        res += prevMax - prices[i];
        prevMax = prices[i];
      } else {
        prevMax = Math.max(prevMax, prices[i]);
      }
    }
    return res;
  }
}
