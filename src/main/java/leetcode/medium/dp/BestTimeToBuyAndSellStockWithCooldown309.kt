package leetcode.medium.dp

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
//
//After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
//Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
class BestTimeToBuyAndSellStockWithCooldown309 {

    val dp = HashMap<String, Int>()
    fun maxProfit(prices: IntArray): Int {
        if (prices.size == 1) return 0

        fun dfs(i: Int, canBuy: Boolean): Int {
            if (i >= prices.size) return 0
            val key = "$i $canBuy"
            if (dp.containsKey(key)) {
                return dp[key]!!
            }
            val cdProfit = dfs(i + 1, canBuy)
            if (canBuy) {
                val buyProfit = dfs(i + 1, false) - prices[i]
                val profit = maxOf(buyProfit, cdProfit)
                dp[key] = profit
                return profit
            } else {
                val sellProfit = dfs(i + 2, true) + prices[i]
                val profit = maxOf(sellProfit, cdProfit)
                dp[key] = profit
                return profit
            }
        }
        return dfs(0, true)
    }

//    fun maxProfit(prices: IntArray): Int {
//        if (prices.size == 1) return 0
//        var l = 0;
//        var prevL = -1
//        val dp = IntArray(prices.size)
//        dp[0] = 0
//        for (i in 1 until prices.size) {
//            if (prices[i] <= prices[i - 1]) { // new segment
//                prevL = l
//                l = i
//                dp[i] = dp[i - 1]
//            } else {
//                if (prevL == -1 || l < 2) {
//                    dp[i] = prices[i] - prices[l]
//                } else {
//                    val sum1 = dp[l - 2] + (prices[i] - prices[l])
//                    val sum2 = dp[l - 1] + (prices[i] - prices[l + 1])
//
//                    val append = if (prevL >= 2) {
//                        dp[prevL - 2]
//                    } else {
//                        0
//                    }
//                    val sum3 = append + prices[i] - prices[prevL]
//
//                    dp[i] = maxOf(sum1, sum2, sum3)
//                }
//            }
//        }
//        return dp[prices.size - 1]
//    }
}