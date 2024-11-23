package leetcode.medium.bin_search

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SearchInRotatedSortedArrayII81Test {
    val target = SearchInRotatedSortedArrayII81()

    @Test
    fun test1() {
//        2, 5, 6, 0, 0, 1, 2    k = 4
//        0 < 2             0 < 2
        assertTrue(target.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
    }

    @Test
    fun test2() {
        assertFalse(target.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
    }

    @Test
    fun test3() {
//        0  1  2  3  4
//        1, 0, 1, 1, 1
//
        assertTrue(target.search(intArrayOf(1, 0, 1, 1, 1), 0))
    }

    @Test
    fun test4() {
        assertTrue(target.search(intArrayOf(2, 2, 2, 3, 2, 2, 2), 3))
    }

    @Test
    fun test5() {
        assertTrue(target.search(intArrayOf(0, 1, 1, 0), 1))
    }

    @Test
    fun test6() {
        assertTrue(target.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
    }

    @Test
    fun test7() {
        assertTrue(
            target.search(
                intArrayOf(
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    13,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1,
                    1
                ), 13
            )
        )
    }


    @Test
    fun test8() {
        assertTrue(target.search(intArrayOf(3, 1), 1))
    }
}