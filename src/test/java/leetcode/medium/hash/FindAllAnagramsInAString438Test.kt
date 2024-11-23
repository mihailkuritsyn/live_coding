package leetcode.medium.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FindAllAnagramsInAString438Test {
    val target = FindAllAnagramsInAString438()

    @Test
    fun test1() {
//        cbaebabacd
//        0123456789
//        l r
        assertEquals(listOf(0, 6), target.findAnagrams("cbaebabacd", "abc"))
    }

    @Test
    fun test2() {
        assertEquals(listOf(0, 1, 2), target.findAnagrams("abab", "ab"))
    }

    @Test
    fun test3() {
        assertEquals(emptyList(), target.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa"))
    }
}