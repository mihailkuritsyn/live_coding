package leetcode.medium.two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class ThreeSum15Test {
    val target = ThreeSum15()

    @Test
    fun test1() {
        //-1, 0, 1, 2, -1, -4
        //-4 -1 -1  0   1   2
        //-4                2 find 2, from last, (m=r) -skip, if (nums[m]<2) - continue
        //-4      -         2 l++
        //   -1 -1          2! find -1, from begin, (m=l) - skip
        //   -1     0   1    !
        //      -1      1    !
        val exp = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        assertContentEquals(exp, target.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    }

    @Test
    fun test2() {
        val exp = listOf(listOf(0, 0, 0))
        assertContentEquals(exp, target.threeSum(intArrayOf(0, 0, 0)))
    }

    @Test
    fun test3() {
        val exp = emptyList<List<Int>>()
        assertContentEquals(exp, target.threeSum(intArrayOf(0, 1, 1)))
    }

    @Test
    fun test4() {
        val exp = listOf(listOf(0, 0, 0))
        assertContentEquals(exp, target.threeSum(intArrayOf(0, 0, 0, 0)))
    }

    @Test
    fun test5() {
        val exp = listOf(listOf(-1, 0, 1))
        assertContentEquals(exp, target.threeSum(intArrayOf(-1, 0, 1, 0)))
    }

    @Test
    fun test6() {
        val exp = listOf(listOf(-2, 0, 2))
        assertContentEquals(exp, target.threeSum(intArrayOf(-2, 0, 0, 2, 2)))
    }
}