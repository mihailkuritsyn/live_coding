package leetcode.medium.dp

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BestTimeToBuyAndSellStockWithCooldown309Test {
    val target = BestTimeToBuyAndSellStockWithCooldown309()

    @Test
    fun test1() {
//        1,2,3,0,2
//        1---3 c
//        1-2 c 0-2  win

//        1,2-1
//        1,2,3-max(1,2 and 1,3)
        val res = target.maxProfit(intArrayOf(1, 2, 3, 0, 2))
        assertEquals(3, res)
    }

    @Test
    fun test2() {
        val res = target.maxProfit(intArrayOf(1))
        assertEquals(0, res)
    }

    @Test
    fun test3() {
//        1,2,3,4,5,0,100
//        b     s c b s
//        1-------5 c     4
//        1-----4 c 0-100 103
        val res = target.maxProfit(intArrayOf(1, 2, 3, 4, 5, 0, 100))
        assertEquals(103, res)
    }

    @Test
    fun test4() {
//        1,2,3,4,100,0,1

//        1-------100 c
//        1-----4 c   0-1
        val res = target.maxProfit(intArrayOf(1, 2, 3, 4, 100, 0, 1))
        assertEquals(99, res)
    }

    @Test
    fun test5() {
//        1,2,3,0,2,9
//        1---3 c 2-9
//        1-2 c 0---9 win
        val res = target.maxProfit(intArrayOf(1, 2, 3, 0, 2, 9))
        assertEquals(10, res)
    }

    @Test
    fun test6() {
        val res = target.maxProfit(intArrayOf(2, 1, 4))
        assertEquals(3, res)
    }

    @Test
    fun test7() {
//                 l     i
//        6, 1, 3, 2, 4, 7
//    dp  0  0  2  2  2  5
        val res = target.maxProfit(intArrayOf(6, 1, 3, 2, 4, 7))
        assertEquals(6, res)
    }

    @Test
    fun test8() {
//        pl         pl     l
//        3, 3, 5, 0, 0, 3, 1, 4
//    dp  0  0  2  2  2  5  5  5
        val res = target.maxProfit(intArrayOf(3, 3, 5, 0, 0, 3, 1, 4))
        assertEquals(6, res)
    }

    @Test
    fun test9() {
        val res = target.maxProfit(
            intArrayOf(
                48,
                12,
                60,
                93,
                97,
                42,
                25,
                64,
                17,
                56,
                85,
                93,
                9,
                48,
                52,
                42,
                58,
                85,
                81,
                84,
                69,
                36,
                1,
                54,
                23,
                15,
                72,
                15,
                11,
                94
            )
        )
        assertEquals(428, res)
    }

}