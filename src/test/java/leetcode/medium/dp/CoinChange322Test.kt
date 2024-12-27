package leetcode.medium.dp

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CoinChange322Test {

    val target = CoinChange322()

    @Test
    fun test1() {
        // 11
        //-1(10)                          -2(9)                    -5(6)
        //9        8       5              8       7      4         5      4       1
        //8 7 4    7 6 3   4 3 0          7 6 3   6 5 2  3 2 -1    4 3 0  3 2 -1  0 -1 -4
        val coins = intArrayOf(1, 2, 5)
        assertEquals(3, target.coinChange(coins, 11))
//        11/5 = 2
//        1/2 = 0
//        1/1 = 1 res=2+1=3
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
//        12 / 5 = 2
//        2 / 3 = 0 res=-1
//        12 /3 = 4
        val coins = intArrayOf(5, 3)
        assertEquals(4, target.coinChange(coins, 12))
    }

    @Test
    fun test5() {
        val coins = intArrayOf(186, 419, 83, 408)
        assertEquals(20, target.coinChange(coins, 6249))
    }
}