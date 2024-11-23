package leetcode.medium.bin_search

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


internal class Search2DMatrix74Test {
    val target = Search2DMatrix74()

    @Test
    fun test1() {
//        [1,3,5,7],[10,11,16,20],[23,30,34,60]
        val m = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60),
        )
        assertTrue(target.searchMatrix(m, 3))
    }

    @Test
    fun test2() {
        val m = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(16, 17, 18, 19, 20),
            intArrayOf(21, 22, 23, 24, 25),
        )
        assertTrue(target.searchMatrix(m, 3))
    }

    @Test
    fun test3() {
        val m = arrayOf(
            intArrayOf(1, 3, 5, 7),
            intArrayOf(10, 11, 16, 20),
            intArrayOf(23, 30, 34, 60)
        )
        assertFalse(target.searchMatrix(m, 13))
    }

}