package leetcode.medium.sliding_window

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LongestSubstringWithoutRepeatingCharacters3Test {

    val target = LongestSubstringWithoutRepeatingCharacters3()

    @Test
    fun test1() {
        assertEquals(3, target.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun test2() {
        assertEquals(1, target.lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun test3() {
        assertEquals(3, target.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun test4() {
//        abcadaf
//        a
//        ab
//        abc
//         bcad
//            da
//            daf
        assertEquals(6, target.lengthOfLongestSubstring("abcadef"))
    }

    @Test
    fun test5() {
        assertEquals(0, target.lengthOfLongestSubstring(""))
    }
}