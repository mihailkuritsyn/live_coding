package leetcode.easy.array

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefix14Test {
    val target = LongestCommonPrefix14()

    @Test
    fun test1() {
        //     "flower"
        //     "flow"
        //     "flight"
        val strings = arrayOf("flower", "flow", "flight")
        assertEquals("fl", target.longestCommonPrefix(strings))
    }

    @Test
    fun test2() {
        val strings = arrayOf("dog", "racecar", "car")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test3() {
        val strings = arrayOf("")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test4() {
        val strings = arrayOf("", "1")
        assertEquals("", target.longestCommonPrefix(strings))
    }

    @Test
    fun test5() {
        val strings = arrayOf("flo", "flo", "flo")
        assertEquals("flo", target.longestCommonPrefix(strings))
    }

}