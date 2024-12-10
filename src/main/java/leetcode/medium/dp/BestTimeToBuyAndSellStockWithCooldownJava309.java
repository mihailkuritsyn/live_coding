package leetcode.medium.dp;

import java.util.HashMap;

public class BestTimeToBuyAndSellStockWithCooldownJava309 {

  record IState(int i, boolean state) {

  }

  private final HashMap<IState, Integer> dp = new HashMap<>();
  private int[] prices;

//  public int maxProfit(int[] prices) {
//    if (prices.length == 1) {
//      return 0;
//    }
//    this.prices = prices;
//    return dfs(0, true);
//  }

  private int dfs(int i, boolean canBuy) {
    if (i >= prices.length) {
      return 0;
    }
    IState currentState = new IState(i, canBuy);
    if (dp.containsKey(currentState)) {
      return dp.get(currentState);
    }
    int cdProfit = dfs(i + 1, canBuy);
    int result;
    if (canBuy) {
      int buyProfit = dfs(i + 1, false) - prices[i];
      result = Math.max(buyProfit, cdProfit);
    } else {
      int sellProfit = dfs(i + 2, true) + prices[i];
      result = Math.max(sellProfit, cdProfit);
    }
    dp.put(currentState, result);
    return result;
  }

  public int maxProfit(int[] prices) {
    int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
    for (int price : prices) {
      prev_buy = buy;
      buy = Math.max(prev_sell - price, prev_buy);
      prev_sell = sell;
      sell = Math.max(prev_buy + price, prev_sell);
    }
    return sell;
  }
}
