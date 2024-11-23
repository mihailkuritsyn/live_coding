package leetcode.medium.bin_search


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SearchInRotatedSortedArray33Test {
    val target = SearchInRotatedSortedArray33()

    @Test
    fun test1() {
//        0  1  2  3  4  5  6
//        4, 5, 6, 7, 0, 1, 2    t = 0
//        l        m        r
//                    l     r
//                    l  m  r
//                    l/r
        val res = target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)
        assertEquals(4, res)
    }

    @Test
    fun test2() {
        val res = target.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3)
        assertEquals(-1, res)
    }

    @Test
    fun test3() {
        val res = target.search(intArrayOf(1), 0)
        assertEquals(-1, res)
    }

    @Test
    fun test4() {
//        0  1
//        3, 1  t=1
//       l/m r
//
        val res = target.search(intArrayOf(3, 1), 1)
        assertEquals(1, res)
    }
}