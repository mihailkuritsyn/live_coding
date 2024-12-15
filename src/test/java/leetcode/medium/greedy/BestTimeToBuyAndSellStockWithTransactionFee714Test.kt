package leetcode.medium.greedy

import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStockWithTransactionFee714Test {
    var target = BestTimeToBuyAndSellStockWithTransactionFee714()

    @Test
    fun test1() {
//      1, 3, 2, 8, 4, 9
//      lr i
//         r  i
//               i
//               r  i     res+4
//                  lr i
//                  l  r
        val prices = intArrayOf(1, 3, 2, 8, 4, 9)
        kotlin.test.assertEquals(8, target.maxProfit(prices, 2))
    }

    @Test
    fun test2() {
//      1, 3, 7, 5, 10, 3
//      lr i
//         r  i
//            r  i
//                   i
//                   r  i  res+=10-1-3=6
//                      lr  i

        val prices = intArrayOf(1, 3, 7, 5, 10, 3)
        kotlin.test.assertEquals(6, target.maxProfit(prices, 3))
    }

    @Test
    fun test3() {
//      3, 2, 1
//     lr  i
        val prices = intArrayOf(3, 2, 1)
        kotlin.test.assertEquals(0, target.maxProfit(prices, 3))
    }

    @Test
    fun test4() {
//      9, 5, 1
//     lr  i
//         lr  i
//             lr i
        val prices = intArrayOf(9, 5, 1)
        kotlin.test.assertEquals(0, target.maxProfit(prices, 3))
    }

    @Test
    fun test5() {
//      1, 3, 10, 5, 14
//     lr  i
//         r  i
//             r  i
//                lr i     res+=10-1-3=6
//                   r i
        val prices = intArrayOf(1, 3, 10, 5, 14)
        kotlin.test.assertEquals(12, target.maxProfit(prices, 3))
    }

    @Test
    fun test6() {
//      1, 3, 10, 5, 14
//     lr  i
//         r  i
//             r  i
        val prices = intArrayOf(1, 3, 10, 8, 14)
        kotlin.test.assertEquals(10, target.maxProfit(prices, 3))
    }

    @Test
    fun test7() {
//      2, 1, 4, 4, 2, 3, 2, 5, 1, 2
//     lr  i
//         lr i
//            r  i
//                  i
//                  lr i    res+=4-1-1=2
//                     r  i
//                       lr  i
//                           r  i
//                              lr  i  res+=5-2-1=2
//                                  r  i
        val prices = intArrayOf(2, 1, 4, 4, 2, 3, 2, 5, 1, 2)
        kotlin.test.assertEquals(4, target.maxProfit(prices, 1))
    }

    @Test
    fun test8() {
//      2, 2, 1, 1, 5, 5, 3, 1, 5, 4
//     lr  i
//         r  i
//               i
//                  i
//                  r  i
//                     r  i
//                        lr
        val prices = intArrayOf(2, 2, 1, 1, 5, 5, 3, 1, 5, 4)
        kotlin.test.assertEquals(4, target.maxProfit(prices, 2))
    }
}