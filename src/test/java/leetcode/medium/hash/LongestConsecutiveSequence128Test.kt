package leetcode.medium.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LongestConsecutiveSequence128Test {

    val target = LongestConsecutiveSequence128()

    @Test
    fun longestConsecutive() {
//        100,4,200,3,2,1
//          0 0   0 1 2 3
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }

    @Test
    fun test2() {
//        100,101,3,2,1
//          1   0 0 1 2
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }

    @Test
    fun test3() {
//        1,2,3,4,5
//        1 1 1 1 0
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }
}