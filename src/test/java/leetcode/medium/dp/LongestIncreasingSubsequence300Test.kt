package leetcode.medium.dp

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LongestIncreasingSubsequence300Test {
    val target = LongestIncreasingSubsequence300()

    @Test
    fun test1() {
        val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
        assertEquals(4, target.lengthOfLIS(nums))
    }
}