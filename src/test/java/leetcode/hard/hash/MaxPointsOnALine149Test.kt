package leetcode.hard.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxPointsOnALine149Test {
    val target = MaxPointsOnALine149()

    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))
        assertEquals(3, target.maxPoints(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(3, 2),
            intArrayOf(5, 3),
            intArrayOf(4, 1),
            intArrayOf(2, 3),
            intArrayOf(1, 4)
        )
        assertEquals(4, target.maxPoints(points))
    }

    @Test
    fun test3() {
        val points = arrayOf(
            intArrayOf(0, 0),
            intArrayOf(4, 5),
            intArrayOf(7, 8),
            intArrayOf(8, 9),
            intArrayOf(5, 6),
            intArrayOf(3, 4),
            intArrayOf(1, 1)
        )
        assertEquals(5, target.maxPoints(points))
    }

    @Test
    fun test4() {
        val points = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(3, 3),
            intArrayOf(-5, 3)
        )
        assertEquals(3, target.maxPoints(points))
    }
}