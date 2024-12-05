package leetcode.medium.greedy

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimizeMaximumPairSumInArray1877Test {
    val target = MinimizeMaximumPairSumInArray1877()

    @Test
    fun test1() {
        assertEquals(7, target.minPairSum(intArrayOf(3, 5, 2, 3)))
    }

    @Test
    fun test2() {
        assertEquals(8, target.minPairSum(intArrayOf(3, 5, 4, 2, 4, 6)))
    }
}