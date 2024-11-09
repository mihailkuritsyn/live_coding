package leetcode.medium.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class LongestConsecutiveSequence128Test {

    val target = LongestConsecutiveSequence128()

    @Test
    fun longestConsecutive() {
//        100,4,200,3,2,1
//          f f   f t t t
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }

    @Test
    fun test2() {
//        100,101,3,2,1
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }

    @Test
    fun test3() {
//        1,2,3,4,5
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }

    @Test
    fun test4() {
//        1,2,3,4,5,10,11,12
        val res = target.longestConsecutive(intArrayOf(100, 4, 200, 1, 3, 2))
        assertEquals(4, res)
    }
}