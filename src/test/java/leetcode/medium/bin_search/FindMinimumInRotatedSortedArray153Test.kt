package leetcode.medium.bin_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FindMinimumInRotatedSortedArray153Test {
    val target = FindMinimumInRotatedSortedArray153()

    @Test
    fun test1() {
        assertEquals(1, target.findMin(intArrayOf(3, 4, 5, 1, 2)))
    }

    @Test
    fun test2() {
        assertEquals(0, target.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
    }

    @Test
    fun test3() {
        assertEquals(11, target.findMin(intArrayOf(11, 13, 15, 17)))
    }

    @Test
    fun test4() {
        assertEquals(0, target.findMin(intArrayOf(0)))
    }

    @Test
    fun test5() {
        assertEquals(0, target.findMin(intArrayOf(1, 0)))
    }
}