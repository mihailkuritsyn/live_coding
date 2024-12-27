package leetcode.medium.dp

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HouseRobber198Test {
    val target = HouseRobber198()

    @Test
    fun test1() {
//        0  1  2  3
//        1, 2, 3, 1
//   dp   1  2  4  4
        val nums = intArrayOf(1, 2, 3, 1)
        assertEquals(4, target.rob(nums))
    }

    @Test
    fun test2() {
//        2, 7, 9, 3, 1
//   dp   2  7  11 11 12
        val nums = intArrayOf(2, 7, 9, 3, 1)
        assertEquals(12, target.rob(nums))
    }
}