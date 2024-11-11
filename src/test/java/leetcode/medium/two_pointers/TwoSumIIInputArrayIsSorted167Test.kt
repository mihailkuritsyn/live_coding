package leetcode.medium.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class TwoSumIIInputArrayIsSorted167Test {
    val target = TwoSumIIInputArrayIsSorted167()

    @Test
    fun test1() {
        assertContentEquals(intArrayOf(1, 2), target.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun test2() {
        assertContentEquals(intArrayOf(1, 3), target.twoSum(intArrayOf(2, 3, 4), 6))
    }

    @Test
    fun test3() {
        assertContentEquals(intArrayOf(1, 2), target.twoSum(intArrayOf(-1, 0), -1))
    }
}