package leetcode.medium.dp.coin_change_322

import kotlin.math.min

//You are given an integer array coins representing coins of
// different denominations and an integer amount representing a total amount of money.
//
//Return the fewest number of coins that you need to make up that amount.
// If that amount of money cannot be made up by any combination of the coins,
// return -1.
//
//You may assume that you have an infinite number of each kind of coin.

class CoinChange322 {

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0
        val dp = IntArray(amount + 1) { 10001 }
        dp[0] = 0
        for (i in 1..amount) {
            for (j in coins.indices) {
                val rem = i - coins[j]
                if (rem >= 0) {
                    dp[i] = min(dp[i], 1 + dp[rem])
                }
            }
        }
        return if (dp[amount] == 10001) -1 else dp[amount]
    }
}