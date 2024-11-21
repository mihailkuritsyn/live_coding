package leetcode.easy.bin_search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class BinarySearch704Test {
    val target = BinarySearch704()

    @Test
    fun test1() {
//        -1, 0, 3, 5, 9, 12
//         0  1  2  3  4  5
//        l      m<9       r
//                  l      r
//                  3  9  12
//                     m
//        0 1 t=9
//        m=0 nums[0] != 9
        assertEquals(4, target.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    }

    @Test
    fun test2() {
        assertEquals(4, target.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    }

    @Test
    fun test3() {
        assertEquals(1, target.search(intArrayOf(2, 5), 5))
    }
}