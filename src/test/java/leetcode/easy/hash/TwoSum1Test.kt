package leetcode.easy.hash

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class TwoSum1Test {

    private val target: TwoSum1 = TwoSum1();

    @Test
    fun test1() {
//        2,7,11,15   9
//        2 7
//        7 2
        val twoSum = target.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertArrayEquals(intArrayOf(0, 1), twoSum)
    }

    @Test
    fun test2() {
//        3,2,4   6
//        3 4 2   diff
//        0 1 2
        val twoSum = target.twoSum(intArrayOf(3, 2, 4), 6)
        assertArrayEquals(intArrayOf(1, 2), twoSum)
    }

    @Test
    fun test3() {
        val twoSum = target.twoSum(intArrayOf(3, 3), 6)
        assertArrayEquals(intArrayOf(0, 1), twoSum)
    }
}