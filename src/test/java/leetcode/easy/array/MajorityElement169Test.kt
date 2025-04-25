package leetcode.easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MajorityElement169Test {
    val target = MajorityElement169()

    @Test
    fun test1() {
        val nums: IntArray = intArrayOf(3, 2, 3)
        assertEquals(3, target.majorityElement(nums))
    }

    @Test
    fun test2() {
        val nums: IntArray = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertEquals(2, target.majorityElement(nums))
    }

    @Test
    fun test3() {
        val nums: IntArray = intArrayOf(2, 2, 2, 2, 2, 1, 1, 1)
        assertEquals(2, target.majorityElement(nums))
    }

    @Test
    fun test4() {
        val nums: IntArray = intArrayOf(2, 1, 2, 1, 2)
        assertEquals(2, target.majorityElement(nums))
    }

    @Test
    fun test5() {
        val nums: IntArray = intArrayOf(6, 5, 5)
        assertEquals(5, target.majorityElement(nums))
    }
}