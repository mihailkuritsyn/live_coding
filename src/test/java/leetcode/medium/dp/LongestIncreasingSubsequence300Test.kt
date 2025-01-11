package leetcode.medium.dp

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestIncreasingSubsequence300Test {
    val target = LongestIncreasingSubsequence300()

    @Test
    fun test1() {
        val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
        assertEquals(4, target.lengthOfLIS(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0, 3, 2, 3)
        assertEquals(4, target.lengthOfLIS(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(7, 7, 7, 7, 7, 7, 7)
        assertEquals(1, target.lengthOfLIS(nums))
    }
}