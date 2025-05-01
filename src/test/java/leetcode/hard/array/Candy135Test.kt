package leetcode.hard.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Candy135Test {
    val target = Candy135()

    @Test
    fun test1() {
        val nums = intArrayOf(1)
        assertEquals(1, target.candy(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 0, 2)
        assertEquals(5, target.candy(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2, 2)
        assertEquals(4, target.candy(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1, 2, 3, 2, 1)
        assertEquals(9, target.candy(nums))
    }

    @Test
    fun test5() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertEquals(15, target.candy(nums))
    }

    @Test
    fun test6() {
//      0  1  2  3  4  5  6  7  8 ind
//      5, 4, 3, 2, 1, 2, 2, 3, 4
        val nums = intArrayOf(5, 4, 3, 2, 1, 2, 2, 3, 4)
        assertEquals(23, target.candy(nums))
    }

}