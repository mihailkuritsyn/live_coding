package leetcode.medium.dp

//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//
//Return the fewest number of coins that you need to make up that amount.
// If that amount of money cannot be made up by any combination of the coins,
// return -1.
//
//You may assume that you have an infinite number of each kind of coin.

class CoinChange322 {

//    fun coinChange(coins: IntArray, amount: Int): Int {
//        if (amount == 0) return 0
//        coins.sortDescending()
//        for (i in coins.indices) {
//            var rem = amount
//            var currRes = 0
//            var coinInd = i
//            while (coinInd < coins.size) {
//                val coinCount = rem / coins[coinInd]
//                rem = rem % coins[coinInd]
//                currRes += coinCount
//                if (rem == 0) {
//                    return currRes
//                }
//                coinInd++
//            }
//        }
//        return -1
//    }


    //------- time limit exceeded solution-----
    private val memo = mutableMapOf<Int, Int>()
    var res = Int.MAX_VALUE
    lateinit var coins_: IntArray

    fun coinChange(coins: IntArray, amount: Int): Int {
        if (amount == 0) return 0
        coins_ = coins
        res = change(0, amount)
        return if (res == Int.MAX_VALUE) -1 else res
    }

    fun change(counter: Int, amount: Int): Int {
        if (amount < 0) {
            return Int.MAX_VALUE
        }
        if (amount == 0) {
            return counter
        }
        if (memo.containsKey(amount)) {
            return memo[amount]!!
        }
        var currMin = Int.MAX_VALUE
        for (i in coins_.indices) {
            val change = change(counter + 1, amount - coins_[i])
            currMin = minOf(currMin, change)
        }
        memo[amount] = currMin
        return currMin
    }
}