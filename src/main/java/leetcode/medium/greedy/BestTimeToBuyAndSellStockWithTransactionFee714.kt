package leetcode.medium.greedy

//You are given an array prices where prices[i] is the price of a given stock on the ith day, and an integer fee representing a transaction fee.
//
//Find the maximum profit you can achieve. You may complete as many transactions as you like, but you need to pay the transaction fee for each transaction.
//
//Note:
//
//You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
//The transaction fee is only charged once for each stock purchase and sale.

class BestTimeToBuyAndSellStockWithTransactionFee714 {
    fun maxProfit(prices: IntArray, fee: Int): Int {
        if (prices.size == 1) return 0

        var res = 0
        var l = 0
        var r = 0
        for (i in 1 until prices.size) {
            if (prices[i] >= prices[r]) {
                r = i
            } else if (prices[r] - prices[i] >= fee) {
                val profit = prices[r] - prices[l] - fee
                res += if (profit > 0) profit else 0
                l = i
                r = i
            } else if(prices[l]>prices[i]){
                l = i
            }
        }
        val profit = prices[r] - prices[l] - fee
        res += if (profit > 0) profit else 0
        return res
    }

}