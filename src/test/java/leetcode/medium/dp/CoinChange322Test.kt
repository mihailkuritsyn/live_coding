package leetcode.medium.dp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoinChange322Test {

    val target = CoinChange322()

    @Test
    fun test1() {
        val coins = intArrayOf(1, 2, 5)
        assertEquals(3, target.coinChange(coins, 11))
    }

    @Test
    fun test2() {
        val coins = intArrayOf(2)
        assertEquals(-1, target.coinChange(coins, 3))
    }

    @Test
    fun test3() {
        val coins = intArrayOf(1)
        assertEquals(0, target.coinChange(coins, 0))
    }

    @Test
    fun test4() {
        val coins = intArrayOf(5, 3)
        assertEquals(4, target.coinChange(coins, 12))
    }

    @Test
    fun test5() {
        val coins = intArrayOf(186, 419, 83, 408)
        assertEquals(20, target.coinChange(coins, 6249))
    }

    @Test
    fun test6() {
        val coins = intArrayOf(1, 3, 4, 5)
        assertEquals(2, target.coinChange(coins, 7))
    }
}